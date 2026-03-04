package com.example.playground.session3
//3
open class Animal {
    open fun sound() {
        println("Animal sound")
    }
}

class Cat : Animal() {
    override fun sound() {
        println("Meow")
    }
}