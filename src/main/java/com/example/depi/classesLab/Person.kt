package com.example.depi.classesLab

data class Person(
    val name: String,
    val address: Address
) {
    data class Address(
        var city: String,
        var streetName: String,
        var building: Building
    )

    fun getData(): String {
        return "\nName: $name" +
                "\n>>>>>Address<<<<<" +
                "\nCity: ${address.city}" +
                "\nStreet Name: ${address.streetName}" +
                "\nBuilding: ${address.building}" +
                "\n"
    }
}

enum class Building {
    VILLA,
    APARTMENT,
}

fun main() {
    val hayam = Person(
        "Hayam Tarek",
        Person.Address(
            "Cairo",
            "9 Street",
            Building.VILLA
        )
    )
    println(hayam)
    println(hayam.getData())
    val mohamed = Person(
        "Mohamed Tarek",
        Person.Address(
            "Giza",
            "18 Street",
            Building.APARTMENT
        )
    )
    println(mohamed)
    println(mohamed.getData())

}