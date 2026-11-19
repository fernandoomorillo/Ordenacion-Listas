object InsertionSort {
    fun <T : Comparable<T>> ordenar(lista: MutableList<T>) {

        // recorrer la lista desde el segundo elemento
        for (i in 1 until lista.size) {

            val elemento = lista[i]

            var j = i - 1

            // desplazar los elementos mayores hacia la derecha
            while (j >= 0 && lista[j] > elemento) {

                lista[j + 1] = lista[j]

                j--
            }

            // insertar el elemento en su posicion correcta
            lista[j + 1] = elemento
        }
    }
}


fun main() {

    println("INSERTION SORT")

    // ordena los vehiculos
    val vehiculos = GenerarDatos.obtenerVehiculos()

    println("\nlista original de vehiculos:")
    println(vehiculos)

    val copiaVehiculos = vehiculos.toMutableList()

    val inicioVehiculos = System.nanoTime()

    InsertionSort.ordenar(copiaVehiculos)

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

    InsertionSort.ordenar(copiaNumeros)

    val finNumeros = System.nanoTime()

    println("\nlista ordenada de numeros:")
    println(copiaNumeros)

    println("tiempo de ejecucion: ${finNumeros - inicioNumeros} nanosegundos")
}