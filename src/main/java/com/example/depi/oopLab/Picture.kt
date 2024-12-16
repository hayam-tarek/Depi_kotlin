package com.example.depi.oopLab

class Picture(val shape1: Shape, val shape2: Shape, val shape3: Shape) {

    fun sumAreas(): Double {
        return shape1.calcArea() + shape2.calcArea() + shape3.calcArea()
    }
}

fun main() {
    val rectangle: Shape = Rectangle(4.0, 5.0)
    val circle: Shape = Circle(5.0)
    val triangle: Shape = Triangle(4.0, 3.0)

    val picture = Picture(rectangle, circle, triangle)
    println("Sum Areas of shapes = ${picture.sumAreas()}")
}