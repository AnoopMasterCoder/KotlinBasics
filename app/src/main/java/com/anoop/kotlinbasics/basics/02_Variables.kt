package com.anoop.kotlinbasics.basics

fun main() {
    val num1 = 1   // Immutable variable
    // num1 = 2; Error -> `val` variables cannot be reassigned.

    var myAge: Byte = 15 // Mutable variable
    myAge = 16     // No error.

    println(myAge)
    myAge = 17
    println(myAge)

    // IMP
    var myNum = 12345
    //  myNum = 32423543543523465  Error -> The variable has already been assigned the type `Int`(implicitly inferred) and hence cannot be reassigned as `Long`.

    val pi = 3.14  // `Double` by default.
    println(pi)
    val _pi = 3.14f  // Now it's of type `Float`. IMP: It's same as ``val pi: Float = 3.14``
    println(_pi)
    val __pi = 3.14159265358f // Drop in precision(it's considered 3.14159267) as the value exceeds than what `Float` can store.
    println(__pi)

}