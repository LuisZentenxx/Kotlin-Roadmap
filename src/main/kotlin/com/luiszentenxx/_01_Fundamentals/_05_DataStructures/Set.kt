package com.luiszentenxx._01_Fundamentals._05_DataStructures
fun main(){
    /*
   * Conjuntos (Set) -> Es una colección que no permite elementos duplicados.
   * No tienen un orden definido.
   * Kotlin proporciona las interfaces Set y MutableSet, y las implementaciones incluyen HashSet, LinkedHashSet y TreeSet.
*/

    // Conjunto mutable
    val dias = mutableSetOf<String>()
    dias.add("Lunes")
    dias.add("Martes")
    dias.addAll(setOf("Miercoles", "Jueves", "Viernes"))
    println(dias)

    // Conjunto inmutable
    val colores = setOf("Hola", "Luis", "Hola")
    println(colores)


}