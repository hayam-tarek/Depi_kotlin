package com.example.depi.oopLab

class Triangle(base: Double, height: Double) : Shape() {
    var height: Double = height
        get() {
            return field
        }
        set(value) {
            if (value > 0.0)
                field = value
        }

    init {
        dim = base
    }

    constructor() : this(1.0, 1.0)

    override fun calcArea(): Double {
        return 0.5 * dim * height
    }
}