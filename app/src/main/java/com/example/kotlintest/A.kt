package com.example.kotlintest

import java.util.prefs.NodeChangeListener

class A : MyInterface {

    override val name: String
    var age: Int
        private set
    lateinit var listener: MyInterface

    companion object {
        fun method(){
            println("companion object method()")
        }
        fun getLengthSafe(string: String?) :Int  = string?.length ?: 0
    }
    override fun myFunc1() {
        println("A : myFunc1()")
    }

    override fun myFunc2() {
        println("A : myFunc2()")
    }

    constructor(name: String = "no name", age: Int = 0) {
        this.name = name
        this.age = age
    }
    fun addListener(listener: MyInterface){
        this.listener = listener
    }
    fun testListener(){
        listener.myFunc1()
    }

}