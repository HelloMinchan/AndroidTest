package com.example.myapplication.kotlin

fun main(args:Array<String>) {

    val value: Int? = null

    when (value) {
        null -> println("value is null")
        else -> println("value is not null")
    }

    val value2: Boolean? = null

    when (value2) {
        true -> println("")
        false -> println("")
        null -> println("")
    }

    val value3 = when (value2) {
        true -> 1
        false -> 3
        null-> 4
    }

    val value4: Int = 10
    when (value4) {
        is Int -> {
            println("val4 is int")
        }
        else -> {
            println("val4 is not int")
        }
    }

    val value5:Int = 87
    when (value5) {
        in 60..70 -> {
            println("1")
        }
        in 70..100 -> {
            println("2")
        }
        else -> {
            println("#")
        }
    }
}