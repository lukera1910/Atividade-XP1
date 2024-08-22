import kotlin.random.Random 

fun main() {
    println("Quantas vezes você deseja lançar os dados?")
    val vezes = readLine()?.toIntOrNull() ?: 0

    if (vezes > 0) {
        for (i in 1..vezes) {
            val dado1 = Random.nextInt(1, 7)
            val dado2 = Random.nextInt(1, 7)
            val soma = dado1 + dado2 

            println("Lançamento $i: Dado 1 = $dado1, Dado 2 = $dado2, Soma = $soma")
        }
    } else {
        println("Número de lançamentos inválido.")
    }
}