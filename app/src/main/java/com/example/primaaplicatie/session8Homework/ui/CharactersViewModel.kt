package com.example.primaaplicatie.session8Homework.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.primaaplicatie.session7Homework.UiState
import com.example.primaaplicatie.session8Homework.data.CharacterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch


class CharactersViewModel(private val repository: CharacterRepository) : ViewModel() {

    private val _uiState = MutableStateFlow<UiState>(UiState.Loading)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    init {
        loadCharacters()
    }

    private fun loadCharacters() {
        viewModelScope.launch {
            _uiState.value = UiState.Loading

            val result = repository.getCharacters()


            _uiState.value = result.fold(
                onSuccess = { characters ->
                    UiState.Success(characters)
                },
                onFailure = { error ->
                    UiState.Error(error.message ?: "Unknown error!")
                }
            )
        }
    }
}


class CharactersViewModelFactory(private val repository: CharacterRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CharactersViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CharactersViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}