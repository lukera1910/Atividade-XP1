class Aluno(val nome: String, val notas: DoubleArray) {
    fun calcularMedia(): Double {
        return notas.average()
    }

    fun foiAprovado(): Boolean {
        return calcularMedia() >= 7.0
    }

    fun exibirResultado() {
        val media = calcularMedia()
        val status = if (foiAprovado()) "Aprovado" else "Reprovado"
        println("Aluno: $nome")
        println("Média: ${"%.2f".format(media)} - $status")
    }
}

fun main() {
    val alunos = mutableListOf<Aluno>()

    for (i in 1..5) {
        println("Digite o nome do $i° aluno:")
        val nome = readLine() ?: ""

        println("Digite as notas do $i° separadas por espaço:")
        val notas = readLine()?.split(" ")?.map { it.toDouble() }?.toDoubleArray() ?: doubleArrayOf()

        val aluno = Aluno(nome, notas)
        alunos.add(aluno)
    }

    for (aluno in alunos) {
        aluno.exibirResultado()
        println()
    }
}