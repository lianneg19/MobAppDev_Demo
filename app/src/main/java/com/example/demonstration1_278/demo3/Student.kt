package com.example.demonstration1_278.demo3

class Student{
    var name:String = ""
    var studentId:Int  = 0


    // accessor (getters and setter)
    get() = field // getter

        set(value) {
            field = value // setter
        }
}
fun main(){
    val student = Student()
    student.name = "John Doe"
    student.studentId = 12345

    println("Name: ${student.name}")
    println("Student ID: ${student.studentId}")

    student.name = "Marty Smith"
    println("Name: ${student.name}")
}