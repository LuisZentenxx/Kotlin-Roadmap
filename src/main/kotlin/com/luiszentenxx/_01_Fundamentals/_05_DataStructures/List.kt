package com.luiszentenxx._01_Fundamentals._05_DataStructures

fun main() {

    val numberList = listOf(1, 4, 7, 2, 21, 43, 0, 32, 4, 6)
    val stringList = listOf("Kotlin", "Java", "Python", "Javascript y Typescript", "Kotlin", "")


    // [Index] Accede al elemento que está en el indice indicado.
    println(numberList[4])
    println(stringList[0])

    // [Size] Devuelve la cantidad de elementos de la lista
    println(numberList.size)
    println(stringList.size)

    // [Contains] Verifica si un elemento está presente en la lista. Devuelve true o false.
    println(numberList.contains(3))
    println(stringList.contains("Haskell"))

    // [IndexOf] Devuelve el indice de la primera aparición del elemento en la lista. Retorna -1 si no coincide.
    println(numberList.indexOf(4))
    println(stringList.indexOf("Python"))

    // [LastIndexOf] Devuelve el indice de la última aparición del elemento en la lista. Retorna -1 si no coincide.
    println(numberList.lastIndexOf(6))
    println(stringList.lastIndexOf("Kotlin"))

    // [Drop] Crea una nueva lista sin los primeros n elementos de la lista original.
    println(numberList.drop(2))
    println(stringList.drop(4))

    // [DropLast] Crea una nueva lista sin los últimos n elementos de la lista original.
    println(numberList.dropLast(1))
    println(stringList.dropLast(3))

    // [Take] Devuelve una nueva lista que contiene solo los primeros n elementos de la lista original.
    println(numberList.take(5))
    println(stringList.take(2))

    // [TakeLast] Devuelve una nueva lista que conteine solo los últimos n elementos de la lista original.
    println(numberList.takeLast(5))
    println(stringList.takeLast(2))

    // [First & Last] Devuelve el primer(first) y último(last) elemento de la lista.
    println(numberList.first())
    println(stringList.last())

    // [None] Retorna true si la lista está vacía, de lo contrario false.
    println(numberList.none())
    println(stringList.none())

    // [Slice] Crea una nueva lista que contiene solo los elementos en el rango de índices especificados.
    println(numberList.slice(0..2))
    println(stringList.slice(2..5))

    // [MinOrNull] Devuelve el valor más bajo(min) y alto(max) de la lista o null si la lista está vacía.
    println(numberList.minOrNull())
    println(stringList.maxOrNull())

    // [Sorted] Ordena los elementos de la lista de menor a mayor y devuelve una nueva lista ordenada.
    println(numberList.sorted())
    println(stringList.sorted())

    // [SortedDescending] Ordena los elementos de la lista de mayor a menor y devuelve una nueva lista ordenada.
    println(numberList.sortedDescending())
    println(stringList.sortedDescending())

    // [Reversed] Devuelve una nueva lista en el orden inverso de los elementos de la lista original.
    println(numberList.reversed())
    println(stringList.reversed())

    // [Random] Selecciona y devuelve un elemento aleatorio de la lista.
    println(numberList.random())
    println(stringList.random())

    // [Shuffled] Devuelve una nueva lista en la que los elementos están en orden aleatorio.
    println(numberList.shuffled())
    println(stringList.shuffled())

    //
    println(numberList.filter { it > 3})
    println(stringList.filter { it.contains("a")})
}
