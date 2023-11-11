package com.anoop.kotlinbasics.exercises

fun main() {

    add()

}

fun add() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val result = num1 + num2
    println("The result of $num1 + $num2 is $result")
}