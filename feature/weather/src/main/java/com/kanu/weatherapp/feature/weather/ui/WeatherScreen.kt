package com.kanu.weatherapp.feature.weather.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kanu.weatherapp.core.ui.theme.DarkBlue
import com.kanu.weatherapp.feature.weather.mvi.WeatherIntent
import com.kanu.weatherapp.feature.weather.mvi.WeatherViewModel

@Composable
fun WeatherScreen(
    viewModel: WeatherViewModel
) {
    val state by viewModel.uiState.collectAsState()
    val pagerState = rememberPagerState(
        initialPage = 5,
        pageCount = { state.weatherCards.size }
    )

    // Lazy Loading: Trigger API call only when a page is settled
    LaunchedEffect(pagerState) {
        snapshotFlow { pagerState.currentPage }.collect { page ->
            viewModel.onIntent(WeatherIntent.LoadCityWeather(page))
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DarkBlue)
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            if (state.weatherCards.isNotEmpty()) {
                HorizontalPager(
                    state = pagerState,
                    modifier = Modifier.fillMaxWidth()
                ) { page ->
                    val card = state.weatherCards[page]
                    WeatherCard(
                        state = card,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            
            // Show hourly forecast for the currently selected city
            val currentCard = state.weatherCards.getOrNull(pagerState.currentPage)
            currentCard?.weatherInfo?.weatherDataPerDay?.get(0)?.let { data ->
                HourlyForecast(
                    weatherData = data,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                )
            }
        }

        if (state.isLoading) {
            CircularProgressIndicator(
                modifier = Modifier.align(Alignment.Center),
                color = Color.White
            )
        }
        state.error?.let { error ->
            Text(
                text = error,
                color = Color.Red,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}
