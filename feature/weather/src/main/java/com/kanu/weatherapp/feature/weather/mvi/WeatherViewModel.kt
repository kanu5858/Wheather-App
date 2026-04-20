package com.kanu.weatherapp.feature.weather.mvi

import androidx.lifecycle.viewModelScope
import com.kanu.weatherapp.core.ui.mvi.BaseViewModel
import com.kanu.weatherapp.domain.use_case.GetWeatherUseCase
import com.kanu.weatherapp.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val getWeatherUseCase: GetWeatherUseCase
) : BaseViewModel<WeatherState, WeatherIntent, WeatherSideEffect>(WeatherState()) {

    override fun onIntent(intent: WeatherIntent) {
        when (intent) {
            is WeatherIntent.LoadWeatherInfo -> {
                loadWeatherInfo(intent.lat, intent.long)
            }
            is WeatherIntent.RefreshWeather -> {
                // For simplicity, we'll need the last known location or handle it in UI
                // For now, we assume UI sends LoadWeatherInfo again
            }
        }
    }

    private fun loadWeatherInfo(lat: Double, long: Double) {
        viewModelScope.launch {
            updateState { copy(isLoading = true, error = null) }
            
            when (val result = getWeatherUseCase(lat, long)) {
                is Resource.Success -> {
                    updateState {
                        copy(
                            weatherInfo = result.data,
                            isLoading = false,
                            error = null
                        )
                    }
                }
                is Resource.Error -> {
                    updateState {
                        copy(
                            weatherInfo = null,
                            isLoading = false,
                            error = result.message
                        )
                    }
                    sendSideEffect(WeatherSideEffect.ShowSnackbar(result.message ?: "Unknown Error"))
                }
            }
        }
    }
}
