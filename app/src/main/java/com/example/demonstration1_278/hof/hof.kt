package com.example.demonstration1_278.hof

/* higher order function (hof) = consumes another function as a parameter and can return
    a function/somehting else
 */

fun main(){
    val sub = {a:Int, b:Int -> a-b}
    hof(sub)

    capitalizedString("hello World", {s-> s.uppercase()})
}

fun hof(subtraction: (Int, Int) -> Int){
    val result = subtraction(10,5)
    println("10 - 5 = $result")
}

fun capitalizedString(str: String, fn:(String) -> String){
    var result = fn(str)
    println(result)
}