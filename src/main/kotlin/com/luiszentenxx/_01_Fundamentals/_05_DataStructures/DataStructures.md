# Estructuras de Datos

Son utilizadas para organizar, gestionar y almacenar datos de manera eficiente. En Kotlin, se pueden utilizar tanto las estructuras de datos estándar de Java como las propias de Kotlin.

## Tipos de Estructuras de Datos

### 1. Listas (List)

Una lista es una colección ordenada que puede contener elementos duplicados. Kotlin proporciona dos tipos de listas:

1. **List** (inmutable): No se pueden modificar después de ser creadas.
2. **MutableList**: Permite agregar, eliminar o modificar elementos.

#### Funcionalidades y Operaciones Comunes

Kotlin proporciona una amplia gama de funciones para operar sobre las estructuras de datos de forma eficiente. Aquí se presentan algunas de las operaciones más comunes:

1. **Acceder a elementos: `list[index]`**
2. **Agregar elementos: `mutableList.add(elemento)`**
3. **Eliminar elementos: `mutableList.remove(elemento)`**
4. **Iterar sobre elementos: `for (item in list) { ... }`**

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
