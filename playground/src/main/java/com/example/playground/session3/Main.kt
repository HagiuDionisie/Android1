package com.example.playground.session3

fun main() {
    //1
    var masina = Car("Passat")

    //2
    val carte = Book("Ion")

    println(carte)

    //4
    val fruits = listOf("mar", "banana", "portocala")
    
    println(fruits[1])

    //5
    val numbers = mutableListOf<Int>(1,2,3,4,5,6,7,8,9)
    println(numbers)
    numbers.add(42)
    println(numbers)

    //6
    fruits.forEach {
        println(it.uppercase())
    }

    //7
    val filtered = numbers.filter { it > 5 }

    println(filtered)

    //8
    val nums = listOf(1, 2)

    val stringList = nums.map { it.toString() }

    println(stringList)

    //9
    Logger.log()



}
object Logger {
    fun log() {
        println("Logging information...")
    }
}