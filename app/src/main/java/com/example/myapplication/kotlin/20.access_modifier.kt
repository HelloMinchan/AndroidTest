package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    val testAccess: TestAccess = TestAccess("아무개")

    testAccess.test()
//    println(testAccess.name)
    testAccess.changeName("아무개 투")
    testAccess.test()

    val reward: Reward = Reward()
//    reward.rewardAmount = 2000
}

class TestAccess {
    private var name: String = "홍길동"

    constructor(name: String) {
        this.name = name
    }

    fun test() {
        println(name)
    }

    fun changeName(name: String) {
        this.name = name
    }
}

class Reward() {
    private var rewardAmount: Int = 1000
}