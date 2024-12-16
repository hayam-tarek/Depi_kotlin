package com.example.depi.oopLab

abstract class Shape() {
    var dim: Double = 0.0
        get() {
            return field
        }
        set(value) {
            if (value > 0.0) field = value
        }

    abstract fun calcArea(): Double
}