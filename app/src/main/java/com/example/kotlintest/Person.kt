package com.example.kotlintest

open class Person(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val another = other as? Person ?: return false
        return another.firstName == firstName &&
                another.lastName == lastName
    }
}