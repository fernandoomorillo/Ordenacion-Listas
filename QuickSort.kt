object QuickSort {

    // Algoritmo Quicksort
    fun <T : Comparable<T>> ordenar(lista: MutableList<T>) {

        quickSort(lista, 0, lista.size - 1)
    }

    private fun <T : Comparable<T>> quickSort(
        lista: MutableList<T>,
        inicio: Int,
        fin: Int
    ) {

        if (inicio < fin) {

            val posicionPivote = particionar(lista, inicio, fin)

            quickSort(lista, inicio, posicionPivote - 1)

            quickSort(lista, posicionPivote + 1, fin)
        }
    }

    // Coloca el pivote en su posición
    private fun <T : Comparable<T>> particionar(
        lista: MutableList<T>,
        inicio: Int,
        fin: Int
    ): Int {

        val pivote = lista[fin]

        var i = inicio - 1

        for (j in inicio until fin) {

            if (lista[j] <= pivote) {

                i++

                val temporal = lista[i]
                lista[i] = lista[j]
                lista[j] = temporal
            }
        }

        val temporal = lista[i + 1]
        lista[i + 1] = lista[fin]
        lista[fin] = temporal

        return i + 1
    }
}

fun main() {

    println("QUICKSORT")

    // Ordena los vehiculos
    val vehiculos = GenerarDatos.obtenerVehiculos()

    println("\nLISTA ORIGINAL DE VEHÍCULOS:")
    println(vehiculos)

    val copiaVehiculos = vehiculos.toMutableList()

    val inicioVehiculos = System.nanoTime()

    QuickSort.ordenar(copiaVehiculos)

    val finVehiculos = System.nanoTime()

    println("\nLISTA ORDENADA DE VEHÍCULOS:")
    println(copiaVehiculos)

    println("Tiempo de ejecución: ${finVehiculos - inicioVehiculos} nanosegundos")


    // Ordena los numeros
    val numeros = GenerarDatos.obtenerNumeros()

    println("\nLISTA ORIGINAL DE NÚMEROS:")
    println(numeros)

    val copiaNumeros = numeros.toMutableList()

    val inicioNumeros = System.nanoTime()

    QuickSort.ordenar(copiaNumeros)

    val finNumeros = System.nanoTime()

    println("\nLISTA ORDENADA DE NÚMEROS:")
    println(copiaNumeros)

    println("Tiempo de ejecución: ${finNumeros - inicioNumeros} nanosegundos")
}