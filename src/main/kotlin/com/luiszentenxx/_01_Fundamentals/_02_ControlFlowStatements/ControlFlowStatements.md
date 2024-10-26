# Declaraciones de Control de Flujos (Control Flow Statements)

Las **declaraciones de control de flujo** son herramientas en programación que nos permiten **tomar decisiones**. En este módulo, veremos dos formas de controlar el flujo de nuestro programa: **if-else** y **when**. 

## 1. If-Else

La declaración `if` se usa para **comprobar si algo es verdadero**. Si lo es, ejecutamos un bloque de código; si no, podemos ejecutar otro bloque usando `else`.

### ¿Cómo Funciona?

1. **Condición**: Es una afirmación que puede ser verdadera o falsa.
2. **Bloque de código**: Se ejecuta si la condición es verdadera.
3. **Bloque alternativo**: Se ejecuta si la condición es falsa.

```kotlin
if (condición) {
    // Código si la condición es verdadera
} else {
    // Código si la condición es falsa
}
```

## 2. When

La declaración `when` es una alternativa más poderosa y flexible. En lugar de tener múltiples `if-else`, puedes usar `when` para verificar una sola expresión y decidir qué hacer en función de su valor.

```kotlin
when (expresión) {
    valor1 -> {
        // Código si expresión == valor1
    }
    valor2 -> {
        // Código si expresión == valor2
    }
    else -> {
        // Código si ninguna de las condiciones anteriores es verdadera
    }
}
```

## Resumen

En este módulo, hemos aprendido sobre las declaraciones de control de flujo:

- `if-else`: Se utiliza para ejecutar bloques de código basados en condiciones.
- `when`: Proporciona una forma más clara y estructurada de manejar múltiples condiciones.