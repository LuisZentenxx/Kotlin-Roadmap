# Estructuras de Datos

Son utilizadas para organizar, gestionar y almacenar datos de manera eficiente. En Kotlin, se pueden utilizar tanto las estructuras de datos estándar de Java como las propias de Kotlin.

## Tipos de Estructuras de Datos

### 1. Listas (List)

Una lista es una colección ordenada que puede contener elementos duplicados. Kotlin proporciona dos tipos de listas:

1. **List** (inmutable): No se pueden modificar después de ser creadas.

   #### Funciones Estandar
  - `.size`: Devuelve el la cantidad de elementos que hay en una la lista.
  - `.contains(element)`: Verifica si un elemento específico está presente en la lista. Retorna ``true`` si lo encuentra y ``false`` si no.
  - `.containsAll(list)`: Comprueba si todos los elementos de otra lista están contenidos en la lista actual. Retorna ``true`` si todos los elementos están presentes, y ``false`` si falta alguno.
  - `list[index]`: Accede al elemento que está en la posición indicada por el índice dentro de la lista.
  - `.indexOf(element)`: Devuelve el índice (posición) de la primera aparición del elemento en la lista. Si el elemento no está, retorna ``-1``.
  - `.lastIndexOf(element)`: Retorna el índice de la última aparición del elemento en la lista. Si no encuentra el elemento, retorna ``-1``.
  - `.drop(n)`: Crea una nueva lista sin los primeros `n` elementos de la lista original. No modifica la lista original.
  - `.dropLast()`: Crea una nueva lista sin los últimos `n` elementos de la lista original. No modifica la lista original.
  - `.take()`: Devuelve una nueva lista que contiene solo los primeros `n` elementos de la lista original.
  - `.takeLast()`: Devuelve una nueva lista que contiene solo los últimos `n` elementos de la lista original.
  - `.first()`: Devuelve el primer elemento de la lista. Lanza una excepción si la lista está vacía.
  - `.last()`: Devuelve el último elemento de la lista. Lanza una excepción si la lista está vacía.
  - `.none()`: Retorna _`true`_ si la lista no contiene elementos (si está vacía). Si tiene al menos un elemento, devuelve _`false`_.
  - `.slice(index)`: Crea una nueva lista que contiene solo los elementos en los índices especificados. Por ejemplo, `slice(0..2)` devuelve una lista con los tres primeros elementos.
  - `.minOrNull()`: Devuelve el valor más bajo de la lista, o ``null`` si la lista está vacía.
  - `.maxOrNull()`: Devuelve el valor más alto de la lista, o ``null`` si la lista está vacía.
  - `.sorted()`: Ordena los elementos de la lista de menor a mayor y devuelve una nueva lista ordenada.
  - `.sortedDescending()`: Ordena los elementos de la lista de mayor a menor y devuelve una nueva lista ordenada.
  - `.reversed()`: Devuelve una nueva lista en el orden inverso de los elementos de la lista original.
  - `.random()`: Selecciona y devuelve un elemento aleatorio de la lista.
  - `.shuffled()`: Devuelve una nueva lista en la que los elementos están en un orden aleatorio, diferente al de la lista original.

      #### Funciones con Lambdas
   - `.filter { ... }`: Crea una nueva lista con solo los elementos que cumplen con la condición especificada en el bloque ``{ ... }``. Útil para filtrar elementos según un criterio específico.
   - `.map { ... }`: Transforma cada elemento de la lista aplicando una operación definida en ``{ ... }`` y devuelve una nueva lista con los resultados. Es útil cuando se quiere modificar o procesar cada elemento de la lista.
   - `.forEach { ... }`:  Ejecuta una acción para cada elemento de la lista, pero **NO** devuelve una nueva lista. Es útil para realizar operaciones como imprimir o hacer cálculos con cada elemento.
   - `.reduce { ... }`: Combina todos los elementos de la lista en un único valor, aplicando la operación definida en ``{ ... }``. Este proceso se realiza acumulando valores de izquierda a derecha, y es útil para operaciones como sumar o concatenar.
   - `.fold { ... }`: Similar a ``.reduce``, pero permite definir un valor inicial. Realiza una acumulación desde ese valor inicial aplicando la operación en ``{ ... }`` y devuelve un valor único.
   - `.find { ... }`: Busca el primer elemento que cumple con la condición especificada en ``{ ... }``. Si lo encuentra, lo devuelve; si no, devuelve ``null``.
   - `.findLast { ... }`: Similar a ``.find``, pero busca desde el último elemento hacia el primero, devolviendo el último que cumpla con la condición dada.
   - `.any { ... }`: Verifica si al menos un elemento de la lista cumple con la condición definida en ``{ ... }``. Devuelve ``true`` si se cumple la condición en al menos un caso; de lo contrario, devuelve ``false``.
   - `.all { ... }`: Verifica si todos los elementos de la lista cumplen con la condición especificada en ``{ ... }``. Devuelve ``true`` si todos los elementos cumplen la condición; de lo contrario, ``false``.
   - `.partition { ... }`: Divide la lista en dos listas: una con los elementos que cumplen con la condición en ``{ ... }`` y otra con los que no.

2. **MutableList**: Permite agregar, eliminar o modificar elementos.

   #### Funcionalidades (mutable List)
   - `list[index]`: Permite acceder a los elementos dado su índice.
   - `add(element)`: Agrega un elemento al final de la lista.
   - `remove(element)`: Elimina el primer elemento que coincide.
   - `clear()`: Elimina todos los elementos.
   - `for (item in list) { ... }`: Itera sobre los elementos de la lista.

#### Ejemplos 
```kotlin
// List (Inmutable)
val colores = listOf("Rojo", "Azul", "Amarillo")

// MutableList
val frutas = mutableListOf("Uva", "Naranja")
mutableFruits.add("Sandía")
```

### Conjuntos (Set)

Un conjunto es una colección de elementos únicos. Lo que significa es que no pueden haber dos o más elementos iguales.

1. **Set** (inmutable): No permite modificaciones después de su creación.
2. **MutableSet**: Permite agregar y eliminar elementos.

#### Funcionalidades y Operaciones Comunes


1. **Acceder a elementos: `set.elementAt(index)`**
2. **Agregar elementos: `mutableSet.add(elemento)`**
3. **Eliminar elementos: `mutableSet.remove(elemento)`**
4. **Iterar sobre elementos: `for (item in set) { ... }`**

#### Ejemplos

```kotlin
// Set (Inmutable)
val numeros = setOf(1, 2, 3, 4)

// MutableList
val decimales = mutableSetOf(1.3, 21.3, 14.16)
decimales.add(0.2)
println(decimales) // Imprime: [1.3, 21.3, 14.16, 0.2]
```

### Mapas (Map)

Un mapa es una colección de pares clave-valor. Kotlin proporciona dos tipos de mapas:

1. **Map** (inmutable): No permite modificaciones después de su creación.
2. **MutableMap**: Permite agregar, eliminar y modificar pares clave-valor.

```kotlin
// Set (Inmutable)
val mapa = mapOf("clave1" to "valor1","clave2" to "valor2","clave3" to "valor3")

// MutableList
val mapaMutable = mutableMapOf("clave1" to "valor1")
mapaMutable["clave2"] = "valor2" // Agregar un nuevo par clave-valor
println(mapaMutable) // Imprime: {clave1=valor1, clave2=valor2}
```

### Arreglos (Arrays)

Un array es una colección de elementos de tamaño fijo. En Kotlin, los arrays pueden contener elementos de cualquier tipo y se definen con la clase Array.

```kotlin
val numeros = arrayOf(1,2,3,4,5)
val letras = arrayOf("a", "b", "c")
```

## Consideraciones sobre Inmutabilidad

Las estructuras de datos inmutables en Kotlin son más seguras para la concurrencia y pueden facilitar el desarrollo al reducir errores de mutación accidental.
