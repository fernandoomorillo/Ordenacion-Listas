object MergeSort {

    // metodo que ordena
    fun <T : Comparable<T>> ordenar(lista: MutableList<T>) {

        if (lista.size > 1) {

            mergeSort(lista, 0, lista.size - 1)
        }
    }

    // metodo que divide la lista
    private fun <T : Comparable<T>> mergeSort(
        lista: MutableList<T>,
        inicio: Int,
        fin: Int
    ) {

        if (inicio < fin) {

            // calcular el punto medio
            val medio = (inicio + fin) / 2

            // dividir la primera mitad
            mergeSort(lista, inicio, medio)

            // dividir la segunda mitad
            mergeSort(lista, medio + 1, fin)

            // unir las dos mitades ordenadas
            fusionar(lista, inicio, medio, fin)
        }
    }

    // fusiona las dos partes de la lista
    private fun <T : Comparable<T>> fusionar(
        lista: MutableList<T>,
        inicio: Int,
        medio: Int,
        fin: Int
    ) {

        val izquierda = lista.subList(inicio, medio + 1).toList()
        val derecha = lista.subList(medio + 1, fin + 1).toList()

        var i = 0
        var j = 0
        var k = inicio

        // comparar los elementos de las dos mitades
        while (i < izquierda.size && j < derecha.size) {

            if (izquierda[i] <= derecha[j]) {

                lista[k] = izquierda[i]
                i++

            } else {

                lista[k] = derecha[j]
                j++
            }

            k++
        }

        // copiar los elementos restantes de la izquierda
        while (i < izquierda.size) {

            lista[k] = izquierda[i]

            i++
            k++
        }

        // copiar los elementos restantes de la derecha
        while (j < derecha.size) {

            lista[k] = derecha[j]

            j++
            k++
        }
    }
}


// programa principal
fun main() {

    println("MERGESORT=")

    // ordena los vehiculos
    val vehiculos = GenerarDatos.obtenerVehiculos()

    println("\nlista original de vehiculos:")
    println(vehiculos)

    val copiaVehiculos = vehiculos.toMutableList()

    val inicioVehiculos = System.nanoTime()

    MergeSort.ordenar(copiaVehiculos)

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

    MergeSort.ordenar(copiaNumeros)

    val finNumeros = System.nanoTime()

    println("\nlista ordenada de numeros:")
    println(copiaNumeros)

    println("tiempo de ejecucion: ${finNumeros - inicioNumeros} nanosegundos")
}