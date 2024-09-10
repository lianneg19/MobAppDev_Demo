package com.example.demonstration1_278

fun main(){
    // single line comment

    /*
    multi-line comment
     */

    println("Hello World")

    // Variable declaration
    val num = 10 // READ-ONLY variable
    println(num)

    // num = 230 // val CANNOT be reassigned
    println(num)

    var num2:Int = 33 // WRITABLE variable aka MUTABLE (can be changed)
    var title:String = "The Hobbit"

    /*
        DATA TYPES:
        Primitives
        - Integer, Double, Boolean
        Non-Primitive
        - String, Array Classes
     */

    val multiLineString = """
        This is Line 1
        This is Line 2
        This is Line 3
    """
    print(multiLineString)

    val PI = 3.1452
    println(PI)
}