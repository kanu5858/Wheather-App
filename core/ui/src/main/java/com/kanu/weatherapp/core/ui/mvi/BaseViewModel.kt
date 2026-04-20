package com.kanu.weatherapp.core.ui.mvi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

abstract class BaseViewModel<S : MviState, I : MviIntent, E : MviSideEffect>(
    initialState: S
) : ViewModel(), MviViewModel<S, I, E> {

    private val _uiState = MutableStateFlow(initialState)
    override val uiState = _uiState.asStateFlow()

    private val _sideEffect = MutableSharedFlow<E>()
    override val sideEffect = _sideEffect.asSharedFlow()

    protected fun updateState(reducer: S.() -> S) {
        _uiState.update { it.reducer() }
    }

    protected fun sendSideEffect(effect: E) {
        viewModelScope.launch {
            _sideEffect.emit(effect)
        }
    }

    abstract override fun onIntent(intent: I)
}
