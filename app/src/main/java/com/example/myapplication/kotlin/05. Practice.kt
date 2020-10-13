package com.example.myapplication.kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun mulThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

fun showMyPlus(first: Int, second: Int): Int {
    println(first)
    println(second)

    fun plus(first: Int, second: Int): Int {
        return first + second
    }

    return plus(first, second)
}

fun main(array: Array<String>) {
    var result = plusThree(1, 2, 3)
    println(result)
    var result2 = minusThree(10, 1, 2)
    println(result2)
    var result3 = mulThree(2, 2, 2)
    println(result3)
    var result4 = mulThree()
    println(result4)

    val result5 = showMyPlus(4, 5)
    println(result5)
}