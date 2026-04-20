package com.kanu.weatherapp.data.repository

import com.kanu.weatherapp.core.network.api.WeatherApi
import com.kanu.weatherapp.data.mapper.toWeatherInfo
import com.kanu.weatherapp.domain.model.WeatherInfo
import com.kanu.weatherapp.domain.repository.WeatherRepository
import com.kanu.weatherapp.domain.util.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
) : WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}
