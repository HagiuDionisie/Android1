package com.example.primaaplicatie.session8Homework.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.AsyncImage
import com.example.primaaplicatie.session7Homework.Character
import com.example.primaaplicatie.session7Homework.RetrofitInstance
import com.example.primaaplicatie.session7Homework.UiState
import com.example.primaaplicatie.session8Homework.data.CharacterRepository

@Composable
fun CharactersScreen(

    viewModel: CharactersViewModel = viewModel(
        factory = CharactersViewModelFactory(
            repository = CharacterRepository(api = RetrofitInstance.api)
        )
    )
) {

    val state by viewModel.uiState.collectAsState()

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        when (val currentState = state) {
            is UiState.Loading -> {
                CircularProgressIndicator()
            }

            is UiState.Error -> {
                Text(text = "Error: ${currentState.msg}")
            }

            is UiState.Success -> {
                val characters = currentState.data

                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(
                        items = characters,
                        key = { character -> character.id }
                    ) { character ->
                        CharacterItem(character = character)
                    }
                }
            }
        }
    }
}

@Composable
fun CharacterItem(character: Character) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        AsyncImage(
            model = character.imageUrl,
            contentDescription = character.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(16.dp))

        Text(text = character.name)
    }
}