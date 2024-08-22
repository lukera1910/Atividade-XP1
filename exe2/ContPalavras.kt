fun main() {
    println("Digite um parágrafo de texto:")
    val paragrafo = readLine() ?: ""

    val palavras = paragrafo.trim().split("\\s+".toRegex())

    val contagemPalavras = palavras.size

    println("O número total de palavras no parágrafo é: $contagemPalavras")
}