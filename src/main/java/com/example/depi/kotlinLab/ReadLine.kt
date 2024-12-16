package com.example.depi.kotlinLab

fun main() {
    println("Please  enter your name: ")
    val defaultName = "Guest"
    val userName: String = readln() ?: defaultName
    val greetingMessage = if (userName == defaultName || userName.isEmpty()) {
        "Hello, $defaultName! Welcome!"
    } else {
        "Hello, $userName! Nice to meet you!"
    }
    println(greetingMessage)
}