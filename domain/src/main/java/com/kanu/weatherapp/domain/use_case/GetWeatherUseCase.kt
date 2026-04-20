package com.kanu.weatherapp.domain.use_case

import com.kanu.weatherapp.domain.model.WeatherInfo
import com.kanu.weatherapp.domain.repository.WeatherRepository
import com.kanu.weatherapp.domain.util.Resource

class GetWeatherUseCase(
    private val repository: WeatherRepository
) {
    suspend operator fun invoke(lat: Double, long: Double): Resource<WeatherInfo> {
        return repository.getWeatherData(lat, long)
    }
}
