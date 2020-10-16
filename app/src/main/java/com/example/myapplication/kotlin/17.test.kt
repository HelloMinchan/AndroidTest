package com.example.myapplication.kotlin

// 1번
// list 2개 만듬
// 첫 list에는 0~9까지 값을 넣음
// 두번째 list 에는 첫번째 리스트의 값을 확인해 짝수면 True, 홀수면 False 넣어준다
fun question1() {
    val list1 = mutableListOf<Int>();
    val list2 = mutableListOf<Boolean>();

    for (i in 0..9) {
        list1.add(i)
    }

    for (item in list1) {
        if (item % 2 == 0)
            list2.add(true)
        else
            list2.add(false)
    }

    println(list1)
    println(list2)
}

// 2번
// 학점
// 80 ~ 90 -> A
// 70 ~ 79 -> B
// 60 ~ 69 -> C
// 나머지 F
fun question2(score: Int): Char {
    var answer: Char = ' '

    when (score) {
        in 80..90 -> answer = 'A'
        in 70..79 -> answer = 'B'
        in 60..69 -> answer = 'C'
        else -> answer = 'F'
    }

    return answer
}

// 3번
// 전달 받은 숫자의 각 자리 숫자의 합을 구함
// 무조건 2자리 숫자가 입력됨
fun question3(number: Int?): Int {
    var answer: Int = 0

    val stringNumber: String = number.toString()

    for (num in stringNumber) {
//        answer += num.toString().toInt()
        answer += Character.getNumericValue(num)
    }

    return answer
}

// 4번
// 구구단 출력하자
fun question4() {
    val nums = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    for (i in nums) {
        for (j in nums) {
            println("" + i + " X " + j + " = " + i * j)
        }
    }
}

fun main(array: Array<String>) {
    println("======qeustion1 답======")
    question1()
    println("========================")

    println()

    println("======qeustion2 답======")
    println(question2(88))
    println(question2(77))
    println(question2(66))
    println(question2(55))
    println(question2(100))
    println("========================")

    println()

    println("======qeustion3 답======")
    println(question3(78))
    println("========================")

    println()

    println("======qeustion4 답======")
    question4()
    println("========================")
}