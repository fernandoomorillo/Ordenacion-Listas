object PancakeSort {

    // Metodo que sirve para ordenar
    fun <T : Comparable<T>> ordenar(lista: MutableList<T>) {

        val tamaño = lista.size

        for (i in tamaño downTo 2) {

            var posicionMaximo = 0

            // BUSCAR EL ELEMENTO MÁS GRANDE
            for (j in 1 until i) {

                if (lista[j] > lista[posicionMaximo]) {
                    posicionMaximo = j
                }
            }

            // COLOCAR EL ELEMENTO MÁS GRANDE AL PRINCIPIO
            if (posicionMaximo != i - 1) {

                voltear(lista, posicionMaximo)

                // COLOCAR EL ELEMENTO AL FINAL
                voltear(lista, i - 1)
            }
        }
    }

    // Invertir la lista
    private fun <T> voltear(
        lista: MutableList<T>,
        posicion: Int
    ) {

        var inicio = 0
        var fin = posicion

        while (inicio < fin) {

            val temporal = lista[inicio]

            lista[inicio] = lista[fin]

            lista[fin] = temporal

            inicio++
            fin--
        }
    }
}


fun main() {

    println("PancakeSort")

    // Ordena los vehiculos
    val vehiculos = GenerarDatos.obtenerVehiculos()

    println("\nLista vehiculos original:")
    println(vehiculos)

    val copiaVehiculos = vehiculos.toMutableList()

    val inicioVehiculos = System.nanoTime()

    PancakeSort.ordenar(copiaVehiculos)

    val finVehiculos = System.nanoTime()

    println("\nLista vehiculos:")
    println(copiaVehiculos)

    println("Tiempo de ejecución: ${finVehiculos - inicioVehiculos} nanosegundos")


    // Ordena los numeros
    val numeros = GenerarDatos.obtenerNumeros()

    println("\nLista de numeros:")
    println(numeros)

    val copiaNumeros = numeros.toMutableList()

    val inicioNumeros = System.nanoTime()

    PancakeSort.ordenar(copiaNumeros)

    val finNumeros = System.nanoTime()

    println("\nLista de numeros ordenada:")
    println(copiaNumeros)

    println("Tiempo de ejecución: ${finNumeros - inicioNumeros} nanosegundos")
}