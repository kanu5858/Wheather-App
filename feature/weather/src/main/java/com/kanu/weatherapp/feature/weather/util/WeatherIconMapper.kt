package com.kanu.weatherapp.feature.weather.util

import androidx.annotation.DrawableRes
import com.kanu.weatherapp.domain.model.WeatherType
import com.kanu.weatherapp.core.ui.R

object WeatherIconMapper {
    @DrawableRes
    fun getIconRes(weatherType: WeatherType): Int {
        return when (weatherType) {
            is WeatherType.ClearSky -> R.drawable.ic_sunny
            is WeatherType.MainlyClear -> R.drawable.ic_partly_cloudy
            is WeatherType.PartlyCloudy -> R.drawable.ic_partly_cloudy
            is WeatherType.Overcast -> R.drawable.ic_cloudy
            is WeatherType.Foggy -> R.drawable.ic_foggy
            is WeatherType.DepositingRimeFog -> R.drawable.ic_foggy
            is WeatherType.LightDrizzle -> R.drawable.ic_drizzle
            is WeatherType.ModerateDrizzle -> R.drawable.ic_drizzle
            is WeatherType.DenseDrizzle -> R.drawable.ic_drizzle
            is WeatherType.LightFreezingDrizzle -> R.drawable.ic_drizzle
            is WeatherType.DenseFreezingDrizzle -> R.drawable.ic_drizzle
            is WeatherType.SlightRain -> R.drawable.ic_rainy
            is WeatherType.ModerateRain -> R.drawable.ic_rainy
            is WeatherType.HeavyRain -> R.drawable.ic_heavy_rain
            is WeatherType.HeavyFreezingRain -> R.drawable.ic_heavy_rain
            is WeatherType.SlightSnowFall -> R.drawable.ic_snowy
            is WeatherType.ModerateSnowFall -> R.drawable.ic_snowy
            is WeatherType.HeavySnowFall -> R.drawable.ic_snowy
            is WeatherType.SnowGrains -> R.drawable.ic_snowy
            is WeatherType.SlightRainShowers -> R.drawable.ic_rainy
            is WeatherType.ModerateRainShowers -> R.drawable.ic_rainy
            is WeatherType.ViolentRainShowers -> R.drawable.ic_heavy_rain
            is WeatherType.SlightSnowShowers -> R.drawable.ic_snowy
            is WeatherType.HeavySnowShowers -> R.drawable.ic_snowy
            is WeatherType.ModerateThunderstorm -> R.drawable.ic_thunderstorm
            is WeatherType.SlightThunderstormWithHail -> R.drawable.ic_thunderstorm
            is WeatherType.HeavyThunderstormWithHail -> R.drawable.ic_thunderstorm
        }
    }
}
