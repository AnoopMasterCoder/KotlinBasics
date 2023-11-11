package com.anoop.kotlinbasics.oop

fun main() {

    val coffeeForAnoop = CoffeeDetails("Anoop", 3, "xl", 5)
    makeCoffee(coffeeForAnoop)

}

fun askCoffeeDetails() {
    print("Enter your name: ")
    val name = readln()
    print("How many spoons of sugar do you want: ")
    val sugarCount = readln().toInt()

    // Call the function
    // com.anoop.kotlinbasics.basics.makeCoffee(sugarCount, name)
}

fun makeCoffee(coffeeDetails: CoffeeDetails) {

    if (coffeeDetails.sugarCount == 1)
        println("Coffee with ${coffeeDetails.sugarCount} spoon of sugar for ${coffeeDetails.name} with cream amount: ${coffeeDetails.creamAmount}")
    else if (coffeeDetails.sugarCount == 0)
        println("Coffee with no sugar for ${coffeeDetails.name}  with cream amount: ${coffeeDetails.creamAmount}")
    else
        println("Coffee with ${coffeeDetails.sugarCount} spoons of sugar for ${coffeeDetails.name} with cream amount: ${coffeeDetails.creamAmount}")
}
