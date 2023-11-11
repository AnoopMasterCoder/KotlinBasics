package com.anoop.kotlinbasics.oop

fun main() {

    // Creating an object/instance if the class `Dog`
    var charlie = Dog("Charlie", "Labrador")
    println("${charlie.name} is a ${charlie.breed} and is ${charlie.age} years old!") // NOTE: The property `age` is not explicitly stated but has the default value set in the class definition.

    var daisy = Dog("Daisy", "Dwarf Poodle", 3) // `age` is now overwritten.
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old!") // NOTE: The property `age` is not explicitly stated but has the default value set in the class definition.


    // Overriding a property of a class (only those properties which have been declared with the `var` keyword in the class can be overwritten.
    daisy.age = 4
    println("A year has passed!")
    println("${daisy.name} is a ${daisy.breed} and is ${daisy.age} years old!") // NOTE: The property `age` is not explicitly stated but has the default value set in the class definition.

}