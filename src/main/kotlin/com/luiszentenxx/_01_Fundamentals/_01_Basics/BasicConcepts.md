# Conceptos Básicos
Este módulo cubre los **fundamentos esenciales** de Kotlin, incluyendo los tipos de datos, operadores y variables.

## 1. Tipo de Datos (Data Types)

Los tipos de datos son fundamentales en cualquier lenguaje de programación, ya que definen el tipo de valor que una variable puede almacenar.

### 1. Tipo de Datos Primitivos

Los tipos de datos primitivos son aquellos que **representan un solo valor** y son fundamentales para la programación. En Kotlin, los tipos de datos primitivos más comunes son:

- **Int**: Representa números enteros, como `1`, `25` o `-10`.


- **Long**: Representa un número entero de 32 bits en un rango de `-2,147,483,648` a `2,147,483,647`


- **Short**: Representa un número entero de 16 bits en un rango de `-32,768` a `32,767`


- **Byte**: Representa un número entero de 8 bits en un rango de `-128` a `127`


- **Double**: Representa números con decimales, como `3.14` o `1.75`.


- **Boolean**: Este tipo tiene solo dos opciones: `true` (verdadero) o `false` (falso). Por ejemplo, puedes usarlo para verificar si una persona es estudiante.


- **Char**: Representa un solo carácter y se denota con comillas simples, como `A`, `d`, `F`.

### 2. Tipos de Datos No Primitivos
Los tipos de datos no primitivos son estructuras más complejas que pueden contener múltiples valores o diferentes tipos de datos.
- **String**: Representa texto, como nombres o frases. Se coloca entre comillas, por ejemplo, `"Hola, Mundo!"`.

### Diferencias Clave

- **Tamaño**: Los tipos primitivos **ocupan menos memoria** y son más **eficientes** en términos de rendimiento, mientras que los tipos no primitivos pueden ocupar más memoria debido a su complejidad.


- **Uso**: Los tipos **Primitivos** son más adecuados para **operaciones simples y matemáticas**, mientras que los tipos **No Primitivos** son útiles para almacenar y organizar datos más complejos.
## 2. Operadores (Operators)

Los operadores son símbolos que te permiten **realizar operaciones con datos**. Piensa en ellos como herramientas que usas para hacer cálculos o comparaciones.
- **Aritmeticos:** Usamos estos para hacer matemáticas.
  - `+` (suma)
  - `-` (resta)
  - `*` (multiplicación)
  - `/` (división)
  - `%` (módulo, que es el resto de una división)
  

- **Comparación:** Nos ayudan a comparar dos valores.
  - `==` (es igual a)
  - `!=` (no es igual a)
  - `>` (es mayor que)
  - `<` (es menor que)
  - `>=` (es mayor o igual a)
  - `<=` (es menor o igual a)
  

- **Lógicos:** Nos ayudan a combinar condiciones.
  - `&&`
  - `||`
  - `!`

```kotlin
val a = 5
val b = 10

val suma = a + b          // Suma
val esIgual = a == b      // Comparación
val esMayor = a > b       // Comparación 
```

## 3. Variables

Las variables son como cajas donde guardamos datos. Dependiendo de cómo las declaremos, pueden ser fijas **(inmutables)** o cambiantes **(mutables)** .
- `val` Se utiliza para declarar una variable de solo lectura (inmutable).
- `var` Se utiliza para declarar una variable que puede cambiar (mutable).

```kotlin

val constante: Int = 5  // Variable inmutable, siempre su valor será 5
var variable: Int = 10  // Variable mutable, puede cambiar su valor

variable = 15 // Cambiando el valor de la variable de 10 a 15

```

## Resumen

Este módulo básico proporciona una introducción a los elementos esenciales de Kotlin. Dominar los tipos de datos, operadores y variables es crucial para avanzar en el aprendizaje de este lenguaje.