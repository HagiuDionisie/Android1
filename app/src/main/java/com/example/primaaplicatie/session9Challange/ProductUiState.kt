package com.example.primaaplicatie.session9Challange

sealed interface ProductUiState{
    object Idle: ProductUiState
    object Loading: ProductUiState
    data class Success (val data: List<Product>): ProductUiState
    data class Error (val message:String): ProductUiState

}