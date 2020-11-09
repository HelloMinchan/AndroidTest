package com.example.myapplication.kotlin

interface Person_ {
    fun eat()
    fun sleep()
}

fun main(args: Array<String>) {
    val student_ : Student = Student()
    student_.eat()
    student_.sleep()
}



class Student_ : Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}

class SoccerPlay: Person_ {
    override fun eat() {

    }

    override fun sleep() {

    }
}


open class Person() {
    open fun eat() {

    }

    fun sleep() {

    }
}

class Student() : Person() {
    override fun eat() {
        super.eat()
    }
}

class Teacher() : Person() {

}