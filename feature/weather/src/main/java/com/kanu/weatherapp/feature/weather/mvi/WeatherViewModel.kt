package com.kanu.weatherapp.feature.weather.mvi

import android.content.Context
import android.location.Geocoder
import android.os.Build
import androidx.lifecycle.viewModelScope
import com.kanu.weatherapp.core.ui.mvi.BaseViewModel
import com.kanu.weatherapp.domain.use_case.GetWeatherUseCase
import com.kanu.weatherapp.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val getWeatherUseCase: GetWeatherUseCase,
    @ApplicationContext private val context: Context
) : BaseViewModel<WeatherState, WeatherIntent, WeatherSideEffect>(WeatherState()) {

    override fun onIntent(intent: WeatherIntent) {
        when (intent) {
            is WeatherIntent.LoadWeatherInfo -> {
                initializeCities(intent.lat, intent.long, intent.cityName)
            }
            is WeatherIntent.LoadCityWeather -> {
                loadCityWeather(intent.index)
            }
            is WeatherIntent.RefreshWeather -> {
            }
        }
    }

    private fun initializeCities(lat: Double, long: Double, cityName: String?) {
        val cities = mutableListOf<CityWeather>()
        for (i in -5..5) {
            // Distribute cities slightly (approx 10-15km apart)
            val offsetLat = lat + (i * 0.15)
            val offsetLong = long + (i * 0.15)
            
            cities.add(
                CityWeather(
                    cityName = if (i == 0) cityName ?: "Current Location" else "Nearby City $i",
                    lat = offsetLat,
                    long = offsetLong,
                    weatherInfo = null,
                    isLoading = false
                )
            )
        }
        updateState { copy(weatherCards = cities) }
        loadCityWeather(5) // Load center city immediately
    }

    private fun loadCityWeather(index: Int) {
        val currentCards = uiState.value.weatherCards
        if (index !in currentCards.indices) return
        
        val city = currentCards[index]
        if (city.weatherInfo != null || city.isLoading) return

        viewModelScope.launch {
            // Set loading for this specific card
            updateState {
                val updatedCards = weatherCards.toMutableList()
                updatedCards[index] = city.copy(isLoading = true)
                copy(weatherCards = updatedCards)
            }

            // Fetch City Name via Reverse Geocoding
            val realCityName = if (index != 5) {
                getCityNameFromCoords(city.lat, city.long) ?: city.cityName
            } else {
                city.cityName
            }

            when (val result = getWeatherUseCase(city.lat, city.long)) {
                is Resource.Success -> {
                    updateState {
                        val finalCards = weatherCards.toMutableList()
                        finalCards[index] = city.copy(
                            cityName = realCityName,
                            weatherInfo = result.data,
                            isLoading = false,
                            error = null
                        )
                        copy(weatherCards = finalCards)
                    }
                }
                is Resource.Error -> {
                    updateState {
                        val finalCards = weatherCards.toMutableList()
                        finalCards[index] = city.copy(
                            cityName = realCityName,
                            isLoading = false,
                            error = result.message
                        )
                        copy(weatherCards = finalCards)
                    }
                }
            }
        }
    }

    private suspend fun getCityNameFromCoords(lat: Double, long: Double): String? = withContext(Dispatchers.IO) {
        try {
            val geocoder = Geocoder(context, Locale.getDefault())
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                val addresses = geocoder.getFromLocation(lat, long, 1)
                addresses?.firstOrNull()?.locality ?: addresses?.firstOrNull()?.subAdminArea
            } else {
                @Suppress("DEPRECATION")
                val addresses = geocoder.getFromLocation(lat, long, 1)
                addresses?.firstOrNull()?.locality ?: addresses?.firstOrNull()?.subAdminArea
            }
        } catch (e: Exception) {
            null
        }
    }
}
