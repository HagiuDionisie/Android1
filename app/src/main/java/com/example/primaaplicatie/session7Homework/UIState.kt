package com.example.primaaplicatie.session7Homework

sealed interface UiState {

    object Loading : UiState

    data class Success(val data: List<Character>) : UiState

    data class Error(val msg: String) : UiState
}