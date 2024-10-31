# Funciones (Functions)

Las funciones son **bloques de código reutilizables** que realizan una tarea específica.

Imagina que las funciones son como pequeñas máquinas que realizan tareas específicas en tu programa.
Una vez que construyes una función, puedes **usarla tantas veces como quieras sin tener que volver a construirla**. Esto hace que tu código sea más limpio y fácil de entender.

En Kotlin, las funciones son ciudadanos de primera clase, lo que significa que pueden ser tratadas como cualquier otro tipo de dato, como números o cadenas. Esto incluye la posibilidad de asignar funciones a variables, pasarlas como argumentos y devolverlas desde otras funciones.

## ¿Por qué son útiles las Funciones?

- **Reutilización**: Escribes una vez el código de la función y puedes usarlo muchas veces.


- **Organización**: Ayudan a organizar tu código en secciones lógicas.


- **Legibilidad**: Facilitan la lectura y comprensión de tu código.

## Tipos de Funciones en Kotlin
Kotlin ofrece diferentes tipos de funciones, y aquí te explico las más comunes:

### 1. Funciones Normales

Las funciones normales son aquellas que se definen utilizando la palabra clave `fun`. Pueden clasificarse según sus características de parámetros y retorno:

- **Funciones sin parámetros ni retorno**: Estan funciones no aceptan argumentos y no devuelven un valor.
```kotlin
fun saludar() { 
    println("¡Hola, mundo!") 
}
```
- **Funciones sin parámetros pero con retorno**: No aceptan argumentos, pero devuelven un valor.
```kotlin
fun obtenerNumero(): Int { 
    return 42
}
```
- **Funciones con parámetros y sin retorno**: Aceptan uno o más argumentos, pero no devuelven un valor.
```kotlin
fun mostrarMensaje(mensaje: String) { 
    println(mensaje)
}
```
- **Funciones con parámetros y con retorno**: Aceptan uno o más argumentos y devuelven un valor.
```kotlin
fun suma(a: Int, b: Int): Int {
    return a + b
}
```

### 2. Funciones de Orden Superior
Las funciones de orden superior son funciones que pueden hacer dos cosas importantes:

1. **Recibir otras funciones como parámetros**: Puedes pasar otras funciones como si fueran datos a otra función.
2. **Devolver funciones**: Pueden crear y devolver nuevas funciones.

#### Ejemplo 1: Función que recibe otra función como parámetro.
Imagina que quieres realizar diferentes operaciones matemáticas, como sumar o multiplicar. En lugar de crear funciones separadas para cada operación, puedes crear una función que acepta la operación como un parámetro.

```kotlin
fun operar(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b) // Llama a la función que pasaste como parámetro
}

// Aquí hay dos funciones que hacen operaciones
fun suma(x: Int, y: Int): Int {
    return x + y
}

fun multiplicar(x: Int, y: Int): Int {
    return x * y
}

fun main() {
    val resultadoSuma = operar(3, 5, ::suma) // Pasa la función 'suma'
    println("Resultado de la suma: $resultadoSuma") // Imprime: Resultado de la suma: 8

    val resultadoMultiplicacion = operar(3, 5, ::multiplicar) // Pasa la función 'multiplicar'
    println("Resultado de la multiplicación: $resultadoMultiplicacion") // Imprime: Resultado de la multiplicación: 15
}
```
#### ¿Cómo funciona?

1. Definimos `operar`: Esta función acepta dos enteros `a` y `b` y una función llamada `operación` que acepta dos enteros y devuelve un entero `(Int, Int) -> Int`.


2. **Llamadas a funciones**: Cuando llamamos a ``operar``, le pasamos los números y la función que queremos que ejecute (como ``suma`` o `multiplicar`).


3. **Ejecución**: Dentro de ``operar``, se ejecuta la función que pasamos como argumento usando ``operacion(a, b)``.

### 3. Funciones Lambda

Una función lambda es una forma especial de escribir una función. Es como una **función más pequeña**, que puedes crear rápidamente y usar en el lugar donde la necesitas, sin tener que darle un nombre.

```kotlin
// Función lambda que suma dos números
val sumarLambda: (Int, Int) -> Int = { a, b -> a + b }

// Usamos la función lambda
val resultado = sumarLambda(3, 5)  // resultado será 8
```

#### ¿Cómo funciona?

1. `val sumarLambda`: Aquí creamos una nueva funcion llamada `sumarLambda`


2. `(Int, Int) -> Int`: Esto le dice a Kotlin que `sumarLambda` es una función que toma dos números enteros `Int` como entrada y devuelve un número entero `Int` como salida.


3. `{`: Este símbolo indica el inicio de una función lambda.


4. `a, b`: Estos son los nombres que le das a los parámetros de la función lambda. Puedes pensar en ellos como las "entradas" que le das a la función.


5. `->`: Este símbolo significa "hace" o "produce". Separa los parámetros de la acción que la lambda realizará.


6. `a + b`: Esta es la acción que la función lambda llevará a cabo. En este caso, suma ``a`` y `b` y devuelve el resultado.

### 4. Lambda Anónima
Las funciones lambda anónimas en Kotlin son expresiones de código que **no tienen un nombre** y que puedes usar para realizar tareas específicas. 

Se llaman **anónimas** porque, a diferencia de las funciones normales, no están asociadas a un nombre específico. 
Son útiles cuando necesitas una **función temporal que no tendrás que reutilizar**.

#### ¿Cuándo se usa una función lambda anónima?
Se usan cuando:
- Necesitas una función rápidamente para una tarea puntual y no quieres crear una función completa.


- Vas a pasar la función como parámetro a otra función y no necesitas reutilizarla.

#### Ejemplo básico
```kotlin
val resultado = run { 5 + 10}
println(resultado) // Imprime 15
```