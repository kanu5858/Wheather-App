package com.kanu.weatherapp.feature.weather.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kanu.weatherapp.domain.model.WeatherData
import com.kanu.weatherapp.feature.weather.util.WeatherIconMapper
import java.time.format.DateTimeFormatter

@Composable
fun HourlyForecast(
    weatherData: List<WeatherData>,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        Text(
            text = "Hourly Forecast",
            fontSize = 20.sp,
            color = textColor
        )
        Spacer(modifier = Modifier.height(16.dp))
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            content = {
                items(weatherData) { data ->
                    HourlyWeatherDisplay(
                        weatherData = data,
                        modifier = Modifier
                            .width(80.dp)
                            .height(120.dp)
                    )
                }
            })
    }
}

@Composable
fun HourlyWeatherDisplay(
    weatherData: WeatherData,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White
) {
    val formattedTime = weatherData.time.format(DateTimeFormatter.ofPattern("HH:mm"))
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = formattedTime,
            color = Color.LightGray,
            fontSize = 12.sp
        )
        Image(
            painter = painterResource(id = WeatherIconMapper.getIconRes(weatherData.weatherType)),
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = "${weatherData.temperatureCelsius}°C",
            color = textColor,
            fontSize = 16.sp
        )
    }
}
