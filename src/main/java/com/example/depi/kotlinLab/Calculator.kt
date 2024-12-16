package com.example.depi.kotlinLab

fun main() {
    do {
        println("Choose operation: ADD, SUB, MUL, DIV")
        val operation = readln().uppercase()

        println("Enter the first number:")
        val num1 = readln().toDouble()

        println("Enter the second number:")
        val num2 = readln().toDouble()

        val result = when (operation) {
            "ADD" -> num1 + num2
            "SUB" -> num1 - num2
            "MUL" -> num1 * num2
            "DIV" -> if (num2 != 0.0) num1 / num2 else "Error: Division by zero!"
            else -> "Invalid operation!"
        }

        println("Result: $result")

        println("Do you want to perform another operation? (yes/no)")
        val choice = readln().lowercase()

    } while (choice == "yes")

    println("Calculator closed.")
}
