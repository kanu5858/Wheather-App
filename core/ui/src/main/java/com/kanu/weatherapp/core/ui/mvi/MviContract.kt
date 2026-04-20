package com.kanu.weatherapp.core.ui.mvi

import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow

interface MviState
interface MviIntent
interface MviSideEffect

interface MviViewModel<S : MviState, I : MviIntent, E : MviSideEffect> {
    val uiState: StateFlow<S>
    val sideEffect: SharedFlow<E>
    fun onIntent(intent: I)
}
