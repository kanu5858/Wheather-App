package com.kanu.weatherapp.domain.model

/**
 * Weather codes based on WMO Weather interpretation codes (WW)
 * https://open-meteo.com/en/docs
 */
sealed class WeatherType(
    val weatherDesc: String
) {
    object ClearSky : WeatherType("Clear sky")
    object MainlyClear : WeatherType("Mainly clear")
    object PartlyCloudy : WeatherType("Partly cloudy")
    object Overcast : WeatherType("Overcast")
    object Foggy : WeatherType("Foggy")
    object DepositingRimeFog : WeatherType("Depositing rime fog")
    object LightDrizzle : WeatherType("Light drizzle")
    object ModerateDrizzle : WeatherType("Moderate drizzle")
    object DenseDrizzle : WeatherType("Dense drizzle")
    object LightFreezingDrizzle : WeatherType("Light freezing drizzle")
    object DenseFreezingDrizzle : WeatherType("Dense freezing drizzle")
    object SlightRain : WeatherType("Slight rain")
    object ModerateRain : WeatherType("Moderate rain")
    object HeavyRain : WeatherType("Heavy rain")
    object HeavyFreezingRain : WeatherType("Heavy freezing rain")
    object SlightSnowFall : WeatherType("Slight snow fall")
    object ModerateSnowFall : WeatherType("Moderate snow fall")
    object HeavySnowFall : WeatherType("Heavy snow fall")
    object SnowGrains : WeatherType("Snow grains")
    object SlightRainShowers : WeatherType("Slight rain showers")
    object ModerateRainShowers : WeatherType("Moderate rain showers")
    object ViolentRainShowers : WeatherType("Violent rain showers")
    object SlightSnowShowers : WeatherType("Slight snow showers")
    object HeavySnowShowers : WeatherType("Heavy snow showers")
    object ModerateThunderstorm : WeatherType("Moderate thunderstorm")
    object SlightThunderstormWithHail : WeatherType("Slight thunderstorm with hail")
    object HeavyThunderstormWithHail : WeatherType("Heavy thunderstorm with hail")

    companion object {
        fun fromWMO(code: Int): WeatherType {
            return when (code) {
                0 -> ClearSky
                1 -> MainlyClear
                2 -> PartlyCloudy
                3 -> Overcast
                45 -> Foggy
                48 -> DepositingRimeFog
                51 -> LightDrizzle
                53 -> ModerateDrizzle
                55 -> DenseDrizzle
                56 -> LightFreezingDrizzle
                57 -> DenseFreezingDrizzle
                61 -> SlightRain
                63 -> ModerateRain
                65 -> HeavyRain
                66 -> HeavyFreezingRain
                67 -> HeavyFreezingRain
                71 -> SlightSnowFall
                73 -> ModerateSnowFall
                75 -> HeavySnowFall
                77 -> SnowGrains
                80 -> SlightRainShowers
                81 -> ModerateRainShowers
                82 -> ViolentRainShowers
                85 -> SlightSnowShowers
                86 -> HeavySnowShowers
                95 -> ModerateThunderstorm
                96 -> SlightThunderstormWithHail
                99 -> HeavyThunderstormWithHail
                else -> ClearSky
            }
        }
    }
}
