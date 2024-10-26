package com.luiszentenxx._01_Fundamentals._05_DataStructures

/*
  * Listas (List) -> Es una colección ordenada que puede contener elementos duplicados.
  * Puedes acceder a los elementos de una lista por su índice.
  * Kotlin ofrece las interfaces List, MutableList y las implementaciones más comunes son ArrayList y LinkedList.
  */

fun main(){
    val city = "Stgo"
    val cityNames = mutableListOf<String>()  //Definir una lista mutable

    //Agregar
    cityNames.add("Paris")
    cityNames.add(city)
    cityNames.addAll(listOf("Viña", "Temuco", "Valdivia"))
    print(cityNames)

    //Eliminar
    cityNames.removeAt(1)
    cityNames.removeFirst()
    cityNames.removeLast()
    cityNames.removeIf{it != ""}
    print(cityNames)




}