package com.kanu.weatherapp.feature.weather.mvi

import com.kanu.weatherapp.core.ui.mvi.MviIntent
import com.kanu.weatherapp.core.ui.mvi.MviSideEffect
import com.kanu.weatherapp.core.ui.mvi.MviState
import com.kanu.weatherapp.domain.model.WeatherInfo

data class CityWeather(
    val cityName: String,
    val lat: Double,
    val long: Double,
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)

data class WeatherState(
    val weatherCards: List<CityWeather> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
) : MviState

sealed class WeatherIntent : MviIntent {
    data class LoadWeatherInfo(val lat: Double, val long: Double, val cityName: String? = null) : WeatherIntent()
    data class LoadCityWeather(val index: Int) : WeatherIntent()
    object RefreshWeather : WeatherIntent()
}

sealed class WeatherSideEffect : MviSideEffect {
    data class ShowSnackbar(val message: String) : WeatherSideEffect()
}
