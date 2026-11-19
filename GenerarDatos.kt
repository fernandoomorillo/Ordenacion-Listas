import kotlin.random.Random

object GenerarDatos {

    // lista de vehiculos
    private val vehiculos = mutableListOf(
        "Seat Ibiza",
        "BMW Serie 3",
        "Toyota Corolla",
        "Audi A4",
        "Ford Focus",
        "Renault Clio",
        "Mercedes Clase A",
        "Volkswagen Golf",
        "Peugeot 208",
        "Hyundai Tucson",
        "Kia Sportage",
        "Opel Astra",
        "Nissan Qashqai",
        "Citroen C3",
        "Dacia Sandero",
        "Honda Civic",
        "Mazda CX-5",
        "Volvo XC60",
        "Fiat 500",
        "Tesla Model 3",
        "Skoda Octavia",
        "Jeep Wrangler",
        "Mini Cooper",
        "Porsche 911",
        "Land Rover Defender",
        "Subaru Impreza",
        "Mitsubishi ASX",
        "Lexus RX",
        "Alfa Romeo Giulia",
        "Jaguar F-Type",
        "Suzuki Swift",
        "Cupra Formentor",
        "Ferrari Roma",
        "Lamborghini Huracan",
        "Bentley Continental",
        "Maserati Ghibli",
        "Chevrolet Camaro",
        "Dodge Charger",
        "Ford Mustang",
        "Aston Martin Vantage"
    )

    // lista numerica
    private val numeros = mutableSetOf<Int>()

    init {

        val aleatorio = Random(1234)

        while (numeros.size < 100) {

            val numero = aleatorio.nextInt(1, 10001)

            numeros.add(numero)
        }
    }

    // devolver una copia de la lista de vehiculos
    fun obtenerVehiculos(): MutableList<String> {
        return vehiculos.toMutableList()
    }

    // devolver una copia de la lista numerica
    fun obtenerNumeros(): MutableList<Int> {
        return numeros.toMutableList()
    }
}


// programa principal para comprobar los datos
fun main() {

    println("LISTA DE VEHICULOS")

    val listaVehiculos = GenerarDatos.obtenerVehiculos()

    println("total de vehiculos: ${listaVehiculos.size}")
    println(listaVehiculos)


    println("\nLISTA NUMERICA")

    val listaNumeros = GenerarDatos.obtenerNumeros()

    println("total de numeros: ${listaNumeros.size}")
    println(listaNumeros)
}