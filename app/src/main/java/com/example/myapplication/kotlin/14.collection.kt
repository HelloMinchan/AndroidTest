package com.example.myapplication.kotlin

fun main(args: Array<String>) {
    /* Immutable Collections */
    val numberList = listOf<Int>(1, 2, 3, 3)
    println(numberList)
    println(numberList.get(1))
    println(numberList[1])

    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println(numberSet)
    numberSet.forEach {
        it
        println(it)
    }

    val numberMap = mapOf<String, Int>("one" to 1)
    println(numberMap["one"])
    println(numberMap.get("one"))

    /* Mutable Collections */
    val mNumberList = mutableListOf<Int>(1,2,3)

    mNumberList.add(3,4)
    println(mNumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,4,4,4)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two",2)

    println(mNumberMap)

    mNumberMap["three"] = 3
    println(mNumberMap["three"])
}