package com.anoop.kotlinbasics.exercises

fun main() {


    // IMP: Range Check
    // Check whether a value lies between two numbers

    // Syntax :
    //      a in startVal..endVal

    print("Enter your age as a whole number: ")
    var age = readln().toInt()

    if (age in 18..39) {
        println("You can enter the club!")
    } else if (age >= 40) {
        println("You cannot go into the club, please go home!")
    } else {
        println("Age not verified. Please contact support.")
    }


}