package com.example.demonstration1_278.hof

// literals or assigned value/hard coded

val name = "john"
val age = 30

fun main(){
    var name = "Mike Wazowski"

    var lname:String? = null // promise to assign a value before using a variable
    lname = "Gabriel"
    println(lname)

    println("10 + 5 = ${addNumbers(10, 5)}")
}