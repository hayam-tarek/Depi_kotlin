package com.example.depi.functionalProgrammingLab

import kotlin.math.pow

fun calculate(a: Double, b: Double, operation: (Double, Double) -> Double): Double {
    return operation(a, b)
}

fun main() {
    val addition = { x: Double, y: Double -> (x + y) }
    val subtraction = { x: Double, y: Double -> (x - y) }
    val multiplication = { x: Double, y: Double -> (x * y) }
    val division = { x: Double, y: Double -> (x / y) }
    val power = { x: Double, y: Double -> x.pow(y) }

    val additionFun = fun(x: Double, y: Double): Double { return (x + y) }
    val subtractionFun = fun(x: Double, y: Double): Double { return (x - y) }
    val multiplicationFun = fun(x: Double, y: Double): Double { return (x * y) }
    val divisionFun = fun(x: Double, y: Double): Double { return (x / y) }
    val powerFun = fun(x: Double, y: Double): Double { return x.pow(y) }

    println("5 + 3 = ${calculate(5.0, 3.0, addition)}")
    println("5 - 3 = ${calculate(5.0, 3.0, subtraction)}")
    println("3 - 5 = ${calculate(3.0, 5.0, subtraction)}")
    println("5 * 3 = ${calculate(5.0, 3.0, multiplication)}")
    println("6 / 3 = ${calculate(6.0, 3.0, division)}")
    println("6 / 0 = ${calculate(6.0, 0.0, division)}")
    println("2 ^ 3 = ${calculate(2.0, 3.0, power)}")
    println()
    println("5 + 3 = ${additionFun(5.0, 3.0)}")
    println("5 - 3 = ${subtractionFun(5.0, 3.0)}")
    println("5 * 3 = ${multiplicationFun(5.0, 3.0)}")
    println("15 / 3 = ${divisionFun(15.0, 3.0)}")
    println("5 ^ 3 = ${powerFun(5.0, 3.0)}")

}
