package com.luiszentenxx._01_Fundamentals._04_Functions

fun main(){
    val suma = { x: Int, y: Int -> x+y }
    val multiplicacion = { x: Int, y: Int -> x*y }

    val resultadoSuma = aplicarOperacion(4,5, suma)
    val resultadoMult = aplicarOperacion(3,10, multiplicacion)

    println("Suma de 4 y 5: $resultadoSuma")
    println("Suma de 3 y 10: $resultadoMult")

    // Ejercicio 2
    val area = { x: Int, y: Int -> x * y }
    val per = { x: Int, y: Int -> (x+y)*2 }

    println(calculo2(5,3,area))
    println(calculo2(5,3,per))

    // Ejercicio 3
    println(oddEven(19))
    println(oddEven2(2))


    val fahrenheit = { x: Float -> x * 9/5 + 32}
    val toFahrenheit: (Float) -> Float = { it * 9/5 + 32 }
    val toCelsius: (Float) -> Float = { (it - 32) * 5/9 }
    println(converter(42f, fahrenheit))



}

fun aplicarOperacion(a: Int, b: Int, operacion:(Int,Int) -> Int) : Int {
    return operacion(a,b)
}

// 2. Calcular área y perimetro de un rectangulo
fun calculo2(b: Int, h:Int, calculos:(Int, Int) -> Int) : Int {
    return calculos(b,h)
}

// 3. Verificar Números Pares
fun oddEven2(n:Int) : Boolean = n % 2 == 0

// 4. Conversión de Temeperatura
fun converter(t:Float, convertion:(Float) -> Float) = convertion(t)

// 5. Suma de una lista con una función lambda

