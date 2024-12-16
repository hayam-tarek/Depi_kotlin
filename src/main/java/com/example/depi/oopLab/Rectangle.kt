package com.example.depi.oopLab

class Rectangle(width: Double, height: Double) : Shape() {
    private var height = 0.0
        get() {
            return field
        }
        set(value) {
            if (value > 0.0)
                field = value
        }

    init {
        this.height = height
        dim = width
    }

    constructor() : this(1.0, 1.0)

    override fun calcArea(): Double {
        return height * dim
    }
}