package com.kanu.weatherapp.domain.repository

import com.kanu.weatherapp.domain.model.WeatherInfo
import com.kanu.weatherapp.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}
