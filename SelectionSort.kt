object SelectionSort {

    // metodo de ordenacion
    fun <T : Comparable<T>> ordenar(lista: MutableList<T>) {

        // recorrer todos los elementos de la lista
        for (i in 0 until lista.size - 1) {

            var posicionMinimo = i

            // buscar el elemento mas pequeño
            for (j in i + 1 until lista.size) {

                if (lista[j] < lista[posicionMinimo]) {

                    posicionMinimo = j
                }
            }

            // intercambia los elementos
            if (posicionMinimo != i) {

                val temporal = lista[i]

                lista[i] = lista[posicionMinimo]

                lista[posicionMinimo] = temporal
            }
        }
    }
}


fun main() {

    println("SELECTION SORT")

    // ordena los vehiculos
    val vehiculos = GenerarDatos.obtenerVehiculos()

    println("\nlista original de vehiculos:")
    println(vehiculos)

    val copiaVehiculos = vehiculos.toMutableList()

    val inicioVehiculos = System.nanoTime()

    SelectionSort.ordenar(copiaVehiculos)

    val finVehiculos = System.nanoTime()

    println("\nlista ordenada de vehiculos:")
    println(copiaVehiculos)

    println("tiempo de ejecucion: ${finVehiculos - inicioVehiculos} nanosegundos")


    // ordena los numeros
    val numeros = GenerarDatos.obtenerNumeros()

    println("\nlista original de numeros:")
    println(numeros)

    val copiaNumeros = numeros.toMutableList()

    val inicioNumeros = System.nanoTime()

    SelectionSort.ordenar(copiaNumeros)

    val finNumeros = System.nanoTime()

    println("\nlista ordenada de numeros:")
    println(copiaNumeros)

    println("tiempo de ejecucion: ${finNumeros - inicioNumeros} nanosegundos")
}