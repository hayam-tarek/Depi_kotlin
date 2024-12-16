package com.example.depi.oopLab

import kotlin.math.PI

class Circle(rad: Double) : Shape() {
    init {
        dim = rad
    }

    constructor() : this(1.0)

    override fun calcArea(): Double {
        return PI * dim * dim
    }
}