package com.example.myapplication.kotlin

fun main(args:Array<String>) {
    val value: Int = 5

    when(value) {
        1 -> {
            println("1")
        }
        2 -> {
            println("2")
        }
        3 -> {
            println("3")
        }
        else -> {
            println("zz")
        }
    }
}