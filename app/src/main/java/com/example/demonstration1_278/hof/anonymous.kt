package com.example.demonstration1_278.hof

// anonymous function = function NOT bound with a name

val addNumbers = fun(a:Int, b:Int):Int // added to a varibale
{
    return a + b
}

fun main(){
    println("10 + 5 = ${addNumbers(10,5)}") // braces = represents a lambda function
}