package com.anoop.kotlinbasics.basics


fun main() {

    print("Enter first number: ")
    val num1 = readln().toDouble()
    print("Enter second number: ")
    val num2 = readln().toDouble()

    val myResult = add(num1.toInt(), num2.toInt())
    println(myResult)

    val myResult2 = divide(num1, num2)
    println(myResult2)


}

fun add(num1: Int, num2: Int): Int {
    val result = num1 + num2
    return result

}

fun divide(num1: Double, num2: Double): Double{

    val result = num1 / num2.toDouble()
    return result

}