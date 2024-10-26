package com.luiszentenxx._01_Fundamentals._04_Functions

fun main() {
    even(5)
}

fun even(a: Int): Boolean {
    return a % 2 == 0
}