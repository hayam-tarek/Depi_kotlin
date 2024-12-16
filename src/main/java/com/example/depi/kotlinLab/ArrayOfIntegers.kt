package com.example.depi.kotlinLab

import kotlin.random.Random

fun main() {
    val myArr = Array(100) { 0 }
    for (i in 0 until 100) {
        myArr[i] = Random.nextInt(1, 101)
        if (myArr[i] <= 10) {
            println("myArr[${i - 1}] = ${myArr[i]}")
        }
    }
}