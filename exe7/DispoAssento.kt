class Voo(val numeroDoVoo: Int, val totalAssentos: Int) {
    private val assentosDisponiveis = BooleanArray(totalAssentos) { true }

    fun verificarDisponibilidade(assento: Int): Boolean {
        return assento in 1..totalAssentos && assentosDisponiveis[assento - 1]
    }

    fun reservarAssento(assento: Int): Boolean {
        return if (verificarDisponibilidade(assento)) {
            assentosDisponiveis[assento - 1] = false
            true
        } else {
            false
        }
    }
}

fun main() {
    val voo = Voo(numeroDoVoo = 1234, totalAssentos = 100)

    println("Digite o número do assento que deseja verificar:")
    val assento = readLine()?.toIntOrNull()

    if (assento != null && assento in 1..100) {
        if (voo.verificarDisponibilidade(assento)) {
            println("Assento $assento está disponível. Deseja reservar? (s/n)")
            val resposta = readLine()

            if (resposta?.lowercase() == "s") {
                if (voo.reservarAssento(assento)) {
                    println("Assento $assento reservado com sucesso!")
                } else {
                    println("Falha ao reservar o assento $assento.")
                }
            } else {
                println("Reserva não realizada.")
            }
        } else {
            println("Assento $assento já está reservado ou é inválido.")
        }
    } else {
        println("Número do assento inválido.")
    }
}