package com.example.lab4z3

class Student(_name: String, _lastname: String) {
    val name: String = _name
    val lastname: String = _lastname

    override fun toString(): String {
        return "$name $lastname";
    }
}