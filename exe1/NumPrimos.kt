fun main() {
    print("Digite um número: ")
    val num = readln().toInt()

    var primo = true

    if (num < 2) {
        primo = false
    } else {
        for (i in 2 until num) {
            if (num % i == 0) {
                primo = false
                break
            }
        }
    }

    if (primo) {
        println("$num é um número primo.")
    } else {
        println("$num não é um número primo.")
    }
}