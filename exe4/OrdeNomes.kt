fun main() {
    val nomes = mutableListOf<String>()

    // Leitura dos nomes dos 10 alunos
    for (i in 1..10) {
        println("Digite o nome do aluno $i:")
        val nome = readLine() ?: ""
        nomes.add(nome)
    }

    // Ordenação dos nomes em ordem alfabética
    nomes.sort()

    // Exibição da lista organizada
    println("\nLista de alunos em ordem alfabética:")
    for (nome in nomes) {
        println(nome)
    }
}
