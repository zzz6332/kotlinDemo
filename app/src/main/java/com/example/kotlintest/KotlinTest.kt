package com.example.kotlintest

fun A.Companion.test(){
    println("A.Companion.test 扩展函数")
}

fun main() {
    val a = A()
    println(a.age)
    A.test()
    A.method()
    a.addListener(object : MyInterface {
        override fun myFunc1() {
            println("myFunc1(): $name")
        }

        override fun myFunc2() {
            TODO("no")
        }

        override val name: String
            get() = "调用了匿名类的get"

    })
    a.testListener()
    val boy: Boy = Boy("张", "三")
    val boy1: Boy = Boy("李", "四", "女")
    val boy2: Boy = Boy("张","三")
    println("boy :$boy,\nboy1:$boy1,\nboy2:$boy2")
    println("boy == boy2: ${boy==boy2}")
}

