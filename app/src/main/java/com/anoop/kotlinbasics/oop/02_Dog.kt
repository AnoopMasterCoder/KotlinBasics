package com.anoop.kotlinbasics.oop

class Dog(
    val name: String, // Adding `val` or `var` next to a `parameter`(which cannot be accessed) makes it a `property`(which can be accessed).
    val breed: String,
    var age: Int = 2  // A default value has been set. If no value is provided to `age` when an object of class `Dog` is created, then the default value (2 in this case) will be used.
) {
    init {
        bark(name)
    }

    fun bark(name: String) {
        println("$name says Woof Woof")
    }
}