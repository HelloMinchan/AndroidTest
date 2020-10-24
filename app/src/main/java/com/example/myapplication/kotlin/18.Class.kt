package com.example.myapplication.kotlin

fun main(array: Array<String>) {
    Car("v8 engine", "big")

    val bigCar: Car = Car("v8 engine", "big")

    val superCar: SuperCar = SuperCar("good", "bog", "door")

    val runableCar: RunableCar = RunableCar("simple", "body")

    runableCar.navi("강남")

    val runableCar2: RunableCar2 = RunableCar2("aaa", "bbb")
    println(runableCar2.engine)
}

class Car(var engine: String, var body: String) {

}

class SuperCar {
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class Car1 constructor(engine: String, body: String) {
    var door: String = ""

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engine: String, body: String) {
    fun ride() {
        println("탑승함ㅋ")
    }

    fun drive() {
        println("달림!")
    }

    fun navi(dest: String) {
        println("$dest 으로 목적지가 설정됨ㅋ")
    }
}

class RunableCar2 {
    var engine: String
    var body: String

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    init {
        println("만들어짐ㅋ")
    }

    fun ride() {
        println("탑승함ㅋ")
    }

    fun drive() {
        println("달림!")
    }

    fun navi(dest: String) {
        println("$dest 으로 목적지가 설정됨ㅋ")
    }
}

class TestClass {
    fun test(a: Int) {
        println("up")
    }

    fun test(a: Int, b: Int) {
        println("down")
    }
}