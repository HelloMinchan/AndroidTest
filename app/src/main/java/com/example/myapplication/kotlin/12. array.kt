package com.example.myapplication.kotlin

fun main(array:Array<String>) {
    var group1 = arrayOf<Int>(1,2,3,4,5)

    println(group1.get(4))
    println(group1[2])

    group1.set(2,111)

    println(group1[2])

    var arr3 = Array(5, {i -> i+1})

    println(arr3[0])
    println(arr3[1])
    println(arr3[2])
    for (num in arr3) {
        println(num)
    }

}