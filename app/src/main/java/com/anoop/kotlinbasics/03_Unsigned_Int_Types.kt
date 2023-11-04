package com.anoop.kotlinbasics

fun main() {

    /*
    * The `Unsigned Integer` Types (UByte, UShort, UInt, ULong)
    * have negative cut off, and hence, doubling the value.
    *
    * Ex: Byte -> -128 to 127
    *     UByte -> 0 to 255
    * */


    var myNum: UByte = 250U
    /* While the `Byte` type can store values ranging from 128 to 127,
       `UByte` can store values from 0 to 255.
     */

    println(myNum)
}