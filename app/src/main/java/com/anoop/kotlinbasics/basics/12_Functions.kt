package com.anoop.kotlinbasics.basics

fun main() {

    print("Enter your name: ")
    val name = readln()
    print("How many spoons of sugar do you want: ")
    val sugarCount = readln().toInt()

    // Calling a function
    makeCoffee(sugarCount, name)
}


// Defining a function
fun makeCoffee(sugarCount: Int, name: String) {

    if (sugarCount == 1)
        println("Coffee with $sugarCount spoon of sugar for $name")
    else if(sugarCount == 0)
        println("Coffee with no sugar for $name")
    else
        println("Coffee with $sugarCount spoons of sugar for $name")
}
