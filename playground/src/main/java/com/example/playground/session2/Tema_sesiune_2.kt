package com.example.playground.session2
fun main()
{
    //1

    println("test")

    val name = "Dionisie"
    var age = 21;

    println("My name is $name, and I am $age years old.")

    //2

    var b: String? = null
    println(b?.length ?: -1)

    //3

    var toBeConverted: Double = 9.99;
    println(toBeConverted)
    var converted = toBeConverted.toInt()
    println(converted)

    //4

    var responseCode = 467
    val message = when (responseCode)
    {
        200->"Succes"
        in 400..500 -> "Client error"
        else -> "Server Error"
    }

    println (message)

    //5

    val numbers = intArrayOf(1,2,3,4,5)
    for (numar in numbers)
    {
        if(numar %2 == 0) println("even $numar")
        else println("uneven $numar")
    }

    //6

    fun mul(a:Int, b:Int) = a*b

    println(mul(3,4))

    //7

    for (i in 10 downTo 1) {
        println(i)
    }
    println("Launch!")

    //8

    val address = """ Bulevard George Enescu """.trimIndent()
    println(address)

    //9

    val example = 1
    //example = 3









}