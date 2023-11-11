package com.anoop.kotlinbasics.basics

fun main() {

    val myTrue: Boolean = true
    val myFalse: Boolean = false

    println(myTrue || myFalse) // If EITHER of the condition is true, return true, else return false
    println(myTrue && myFalse) // If BOTH of the conditions are true, return true, else return false
    println(!myTrue)           // Negate the given condition

}