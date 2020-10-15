package com.example.myapplication.kotlin

fun main(args:Array<String>) {
    val a: Int = 5
    val b: Int = 10

    if (a > b) println("zz")
    else {
        println("asdf")
    }

    val max = if (a > b) {
        a
    } else {
        b
    }
    val m = kotlin.math.max(a, b)
    println(max)
    println(m)
}