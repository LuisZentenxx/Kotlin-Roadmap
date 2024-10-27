package com.luiszentenxx._01_Fundamentals._04_Functions

fun main() {
    val numeros: (Int,Int) -> Int = {a,b -> a+b}
    print(numeros(5,10))
}


