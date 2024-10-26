package com.luiszentenxx._01_Fundamentals._01_Basics

import java.sql.DriverManager.println

fun main() {

    // Números Enteros
    val edad: Int = 36
    println("Edad: $edad años")

    val poblacion: Long = 7_900_000_000
    println("Población mundial: $poblacion")

    val temperatura: Short = -10
    println("Temperatura: $temperatura °C")

    val byteEjemplo: Byte = 100
    println("Ejemplo de Byte: $byteEjemplo")

    // Números de Punto Flotante
    val altura: Float = 1.75F
    println("Altura: $altura metros")

    val precio: Double = 19.99
    println("Precio: $$precio")

    // Caracteres y Booleanos
    val letra: Char = 'A'
    println("Letra: $letra")

    val esEstudiante: Boolean = true
    println("¿Es estudiante?: $esEstudiante")
}
