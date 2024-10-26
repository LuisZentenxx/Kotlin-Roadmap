# ¿Qué es la Complejidad Temporal?

La **complejidad temporal** mide el tiempo que un algoritmo necesita para ejecutarse, en función del número de elementos que maneja. Este tiempo puede variar dependiendo de la estructura de datos utilizada y de la operación que se esté realizando (como agregar, eliminar o buscar un elemento).

## Notación Big O

La **notación Big O** se usa para expresar la complejidad temporal de un algoritmo. Describe el peor caso que un algoritmo podría enfrentar, permitiendo entender cómo se comportará a medida que el tamaño de los datos aumenta. Aquí tienes algunas de las notaciones más comunes:

- **O(1): Tiempo constante**:
  - La operación toma el mismo tiempo, independientemente de cuántos elementos haya. 
  - _Ejemplo_: Acceder a un elemento en un arreglo por índice.


- **O(n): Tiempo lineal**:
  - El tiempo de ejecución aumenta linealmente con el número de elementos. Si duplicas los elementos, el tiempo de ejecución también se duplica.
  - _Ejemplo_: Buscar un elemento en una lista no ordenada.
  

- **O(n^2): Tiempo cuadrático**:
  - El tiempo de ejecución aumenta cuadráticamente. Esto sucede comúnmente en algoritmos de búsqueda o ordenación que necesitan comparar cada elemento con todos los demás.
  

- **O(log n): Tiempo logarítmico**:
  - El tiempo de ejecución crece lentamente a medida que aumenta el número de elementos. Esto es común en algoritmos de búsqueda binaria.

## Tabla Comparativa de Complejidad Temporal

| Tipo de Complejidad | Complejidad      | Descripción                                    | Ejemplo de Uso               |
|:---------------------|:------------------|:-----------------------------------------------|:------------------------------|
| **Constante**        | **O(1)**          | Tiempo constante. No depende del tamaño de los datos. | Acceso a un elemento en un array. |
| **Lineal**          | **O(n)**          | Tiempo lineal. Aumenta con el tamaño de los datos. | Buscar un elemento en una lista.  |
| **Cuadrática**      | **O(n²)**        | Tiempo cuadrático. Común en algoritmos de comparación. | Ordenar una lista con el algoritmo de burbuja. |
| **Logarítmica**     | **O(log n)**     | Tiempo logarítmico. Crece lentamente con el tamaño de los datos. | Búsqueda binaria en un array ordenado. |

## Importancia de entender la Complejidad Temporal

Comprender la complejidad temporal es crucial para **escribir algoritmos eficientes**. Permite elegir las estructuras de datos y los algoritmos adecuados según el tamaño esperado de los datos de entrada. Al analizar la complejidad temporal, puedes **optimizar tu código** para manejar conjuntos de datos más grandes de manera más efectiva, lo que resulta en un **mejor rendimiento** y experiencia del usuario.
