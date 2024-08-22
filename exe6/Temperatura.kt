fun main() {
    val temperaturas = DoubleArray(30)

    for (i in temperaturas.indices) {
        println("Digite a temperatura do dia ${i + 1}:")
        temperaturas[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }

    val temperaturaMedia = temperaturas.average()

    val temperaturaMaxima = temperaturas.maxOrNull() ?: 0.0
    val diaMaxima = temperaturas.toList().indexOf(temperaturaMaxima) + 1

    val temperaturaMinima = temperaturas.minOrNull() ?: 0.0
    val diaMinima = temperaturas.toList().indexOf(temperaturaMinima) + 1

    println("\nResultados da análise de dados meteorológicos:")
    println("Temperatura Média: ${"%.2f".format(temperaturaMedia)}°C")
    println("Temperatura Máxima: ${"%.2f".format(temperaturaMaxima)}°C ocorreu no dia $diaMaxima")
    println("Temperatura Mínima: ${"%.2f".format(temperaturaMinima)}°C ocorreu no dia $diaMinima")
}