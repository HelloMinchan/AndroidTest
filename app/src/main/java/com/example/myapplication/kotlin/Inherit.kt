package com.example.myapplication.kotlin

fun main(args:Array<String>) {
    val superCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()

    val bus100: Bus100 = Bus100()
}

open class Car100() {
    fun drive () {

    }
    fun stop () {

    }
}

class SuperCar100(): Car100() {

}

class Bus100() {

}