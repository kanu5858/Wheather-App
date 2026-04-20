package com.kanu.weatherapp.core.network.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherDto(
    @SerialName("hourly")
    val weatherData: WeatherDataDto
)
