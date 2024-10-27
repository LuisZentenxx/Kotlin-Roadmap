package com.luiszentenxx._01_Fundamentals._02_ControlFlowStatements

import java.sql.DriverManager.println

fun main(){

    // Ejercicio 1: Verificar si un número es positivo, negativo o cero

    val numero = 5  // Cambia este valor para probar otros casos

    if (numero > 0) {
        println("El número es positivo.")
    } else if (numero < 0) {
        println("El número es negativo.")
    } else {
        println("El número es igual a 0.")
    }

    // Ejercicio 2: Determinar el mes
     val mes = 4

    when (mes) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Número no válido.")
    }

    // Ejercicio 3: Clasificación de un día de la semana.

    val dia = 6

    // Usando if-else
    if (dia >= 1 && dia <= 5) {
        println("Es un día laboral.")
    } else if (dia == 6 || dia == 7) {
        println("Es fin de semana.")
    } else {
        println("Número no válido.")
    }

    // Usando when
    when (dia) {
        in 1..5 -> println("Es un día laboral")
        6, 7 -> println("Es fin de semana.")
        else -> println("Número no válido.")
    }

}