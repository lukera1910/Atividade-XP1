class Produto(
    val nome: String,
    var quantidade: Int,
    val nivelMinimo: Int,
    val nivelMaximo: Int
) {
    fun verificarEstoque() {
        if (quantidade < nivelMinimo) {
            reporEstoque()
        } else {
            println("Estoque de $nome está adequado. Quantidade: $quantidade")
        }
    }

    private fun reporEstoque() {
        println("Estoque de $nome abaixo do nível mínimo. Repondo estoque...")
        quantidade = nivelMaximo
        println("Estoque de $nome reposto para $quantidade unidades.")
    }
}

fun main() {
    val produtos = mutableListOf<Produto>()

    for (i in 1..5) {
        println("Digite o nome do produto $i:")
        val nome = readLine().orEmpty()
        println("Digite a quantidade atual de $nome:")
        val quantidade = readLine()?.toIntOrNull() ?: 0
        println("Digite o nível mínimo de $nome:")
        val nivelMinimo = readLine()?.toIntOrNull() ?: 0
        println("Digite o nível máximo de $nome:")
        val nivelMaximo = readLine()?.toIntOrNull() ?: 0

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
    }

    println("\nVerificando estoque dos produtos...")
    for (produto in produtos) {
        produto.verificarEstoque()
    }
}
