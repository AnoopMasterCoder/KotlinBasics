package com.anoop.kotlinbasics.basics

fun main() {

    var age = 15
    // Read what the user had entered into the console
    println("Please enter your age as a whole number: ")
    val enteredValue = readln()
    // Convert the entered value to integer
    age = enteredValue.toInt()

    if (age >= 40){                             // REMEMBER: Only the first condition that is true will be executed
        println("You can't go into the club")
    }else if (age >=18){
        println("You can go into the club")
    }else{
        println("You are too young to go into the club!")
    }

}