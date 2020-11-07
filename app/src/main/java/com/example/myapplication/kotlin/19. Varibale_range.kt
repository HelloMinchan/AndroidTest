package com.example.myapplication.kotlin

var number100: Int = 100

fun main(args: Array<String>) {
    println(number100)

    val test = Test("홍길동")
    test.testFun()
    test.name
    println(number100)

}

class Test(var name: String) {
    fun testFun() {
        name = "홍길동"
        number100 = 10
    }
}