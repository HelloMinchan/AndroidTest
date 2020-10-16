package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (item in a) {
        if (item == 5)
            println(item)
        else
            println("Zz")
    }

    println()

    for ((index, item) in a.withIndex()) {
        println("" + index + " " + item)
    }

    a.forEach {
        println(it)
    }
    a.forEach { item ->
        println(item)
    }
    a.forEachIndexed { index, item ->
        println("" + index + " " + item)
    }

    for ( i in 0 until a.size) {
        println(i)
    }

    for ( i in 0 until a.size step(2)) {
        println(a[i])
    }

    for ( i in a.size -1 downTo (0)) {
        println(i)
    }
    for ( i in a.size -1 downTo (0) step (2)) {
        println(a[i])
    }
    for ( i in 0..a.size) {
        println(i)
    }

    var b: Int = 0
    var c: Int = 4

    while ( b< c) {
        b++
        println("b")
    }

    do {
        println("hello")
    } while (b < c)
}