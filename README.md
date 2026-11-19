# Ordenacion-Listas
## Descripción
Este proyecto consiste en implementar y comparar cinco algoritmos de ordenación utilizando el lenguaje de programación Kotlin.

El objetivo es conocer el funcionamiento de distintos métodos de ordenación, analizar sus diferencias y comparar el tiempo de ejecución de cada uno.

## Algoritmos implementados

En esta práctica se han desarrollado los siguientes algoritmos:

1. **QuickSort**
2. **Pancake Sort**
3. **MergeSort**
4. **Insertion Sort**
5. **Selection Sort**

## Estructura del proyecto

OrdenacionListas/
GenerarDatos.kt
01_QuickSort.kt
02_PancakeSort.kt
03_MergeSort.kt
04_AlgoritmoLibre.kt
05_AlgoritmoLibre.kt

## Generación de datos
El archivo GenerarDatos se encarga de crear los datos que utilizan los algoritmos:

- Una lista de nombres de vehículos con al menos 40 vehiculos
- Una lista de 100 números enteros aleatorios entre 1 y 10.000.

## Funcionamiento

Cada algoritmo realiza las siguientes operaciones:

1. Obtiene una copia de las listas originales.
2. Muestra la lista antes de ordenarla.
3. Ordena los elementos de menor a mayor o alfabéticamente, según el tipo de dato.
4. Muestra la lista ordenada.
5. Calcula el tiempo de ejecución utilizando `System.nanoTime()`.
