package com.luiszentenxx._01_Fundamentals._05_DataStructures

fun main(){
    ex1()
    ex2()
    ex3()
}

private fun ex1(){

    // Crea una lista de números enteros y luego imprime cuántos de esos son mayores que 10
    val intNumbList = listOf(1,35,10,25,4,0,-2,53,-10)
    val highToTen = intNumbList.count{ it > 10 }
    println("Los números que son mayores a 10 son: ${intNumbList.filter { it > 10 }}, en total son $highToTen")
}
private fun ex2(){
    // Crea una lista de palabras y calcula la longitud de cada una, imprimiendo una lista con las longitudes
    val words = listOf("Kotlin es un lenguaje", "para desarrollar", "apps móviles")
    println(words.map {it.length})
}

private fun ex3(){

    // Crea una lista de letras y encuentra la letra que aparece con mayor frecuencia en la lista.
    val chars = listOf('a', 'c', 'f', 'a', 'e', 'i', 'g', 'g', 'a', 'f', 'n')
    val frecuencies = chars.groupingBy { it }.eachCount()
    val mostFrequent = frecuencies.maxByOrNull { it.value }?.key
    println("La letra más frecuente en la lista es $mostFrequent")
   }
