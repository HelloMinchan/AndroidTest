package com.example.myapplication.kotlin

fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)
    val result: Int = first + second
    return result
}

fun plustFive(first: Int, second: Int = 5): Int {
    return first + second
}

fun printPlus(first: Int, second: Int): Unit {
    println(first + second)
}


fun printPlus2(first: Int, second: Int) {
    println(first + second)
}

fun plusShort(first: Int, second: Int) = first + second

fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
    println(plus(10, 20))
    println(plus(second = 11, first = 1))

    println(plustFive(10))
    printPlus(1, 2)
    printPlus2(2, 3)
    println(plusShort(1, 2))

    plusMany(1, 2, 3, 4, 5)
}