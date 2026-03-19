package com.example.primaaplicatie.session7Homework

import retrofit2.http.GET
interface RickMortyApi {

    @GET("character")

    suspend fun getCharacters(): CharacterResponse

}