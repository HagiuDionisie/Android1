package com.example.primaaplicatie.session7Homework

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Character(
    val id: Int,
    val name:String,

    @SerialName("image")
    val imageUrl: String

)

@Serializable
data class CharacterResponse(
    val results: List<Character>
)

