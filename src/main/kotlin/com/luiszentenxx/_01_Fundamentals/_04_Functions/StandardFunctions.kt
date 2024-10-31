package com.luiszentenxx._01_Fundamentals._04_Functions

fun main() {

    // 1
    mostrarMensaje()
    //2
    saludar("Dev")
    //3
    val numero = obtenerNumeroFavorito()
    println("Mi número favorito es: $numero")
    //4
    val resultado = multiplicar(3, 4)
    println("El resultado de la multiplicación es: $resultado")
    // 5
    calculo(5,3)
    // 6
    println(oddEven(4))
    println(oddEven(10))


}


// 1. Función sin parámetros ni retorno
fun mostrarMensaje(){
    println("¡Hola, Kotlin!")
}

// 2. Función con parámetros y sin retorno
fun saludar(nombre: String) {
    println("Hola, $nombre")
}

// 3. Función con retorno y sin parámetros
fun obtenerNumeroFavorito(): Int {
    return 7
}

// 4. Función con parámetros y con retorno

fun multiplicar(a: Int, b: Int): Int {
    return a * b
}

// 5. Calcular área y perimetro de un rectangulo
fun calculo(b: Int, h: Int){
    val area = b * h
    val perimetro = (b+h)*2
    println("El área del rectangulo es $area")
    println("El perimetro del rectangulo es $perimetro")
}

// 6. Verificar si un número es par
fun oddEven(n: Int) : Boolean {
    return if (n % 2 == 0) {
        true
    } else {
        false
    }
}




