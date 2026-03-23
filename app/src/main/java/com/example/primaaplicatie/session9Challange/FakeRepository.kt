package com.example.primaaplicatie.session9Challange

import kotlinx.coroutines.delay

class FakeRepository {
    private val mockDataBase = listOf(
        Product(1, "Milk", 4.45),
        Product(2, "Bread", 4.99),
        Product(3, "Roasted nuts with honey", 8.63)
    )

    suspend fun search(query: String): Result<List<Product>>{
        delay(1000)

        if(query.equals("Alchohol", ignoreCase = true)){
            return Result.failure(Exception("Age verification requiered!"))
        }

        val results = if(query.isBlank())
        {
            mockDataBase
        } else{
            mockDataBase.filter{it.name.contains(query, ignoreCase = true)}
        }

        return Result.success(results)
    }



}