package com.kanu.weatherapp

import android.Manifest
import android.location.Geocoder
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.kanu.weatherapp.domain.location.LocationTracker
import com.kanu.weatherapp.feature.weather.mvi.WeatherIntent
import com.kanu.weatherapp.feature.weather.mvi.WeatherViewModel
import com.kanu.weatherapp.feature.weather.ui.WeatherScreen
import com.kanu.weatherapp.ui.theme.WeatherAppTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: WeatherViewModel by viewModels()
    private lateinit var permissionLauncher: ActivityResultLauncher<Array<String>>

    @Inject
    lateinit var locationTracker: LocationTracker

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        permissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            lifecycleScope.launch {
                locationTracker.getCurrentLocation()?.let { location ->
                    val cityName = getCityName(location.latitude, location.longitude)
                    viewModel.onIntent(
                        WeatherIntent.LoadWeatherInfo(
                            location.latitude,
                            location.longitude,
                            cityName
                        )
                    )
                } ?: run {
                    viewModel.onIntent(WeatherIntent.LoadWeatherInfo(51.5074, -0.1278, "London"))
                }
            }
        }

        permissionLauncher.launch(arrayOf(
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION,
        ))

        enableEdgeToEdge()
        setContent {
            WeatherAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WeatherScreen(viewModel = viewModel)
                }
            }
        }
    }

    private suspend fun getCityName(lat: Double, long: Double): String? = withContext(Dispatchers.IO) {
        try {
            val geocoder = Geocoder(this@MainActivity, Locale.getDefault())
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                // Modern API
                // Geocoder.getFromLocation(lat, long, 1) { addresses -> ... } 
                // Using the older synchronous version with withContext(Dispatchers.IO) for simplicity in this flow
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
