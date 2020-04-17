package com.example.kotlintest

class Boy(firstName: String, lastName: String, val sex: String = "男") :
    Person(firstName, lastName) {
    override fun toString(): String {
        return "first name:$firstName, last name:$lastName,sex:$sex"
    }

    override fun equals(other: Any?): Boolean {
        val another: Boy = other as? Boy ?: return false
        return another.firstName == firstName &&
                another.lastName == lastName &&
                another.sex == sex
    }
}