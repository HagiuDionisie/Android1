package com.example.primaaplicatie.session8Homework.data

import com.example.primaaplicatie.session7Homework.Character
import com.example.primaaplicatie.session7Homework.RickMortyApi


class CharacterRepository(private val api: RickMortyApi) {


    suspend fun getCharacters(): Result<List<Character>> {
        return try {

            val response = api.getCharacters()


            Result.success(response.results)

        } catch (e: Exception) {

            Result.failure(e)
        }
    }
}