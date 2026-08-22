fun main() {
    print("Quantos números deseja somar? ")
    val n = readln().toIntOrNull() ?: 0
    var soma = 0
    for (i in 1..n) {
        print("Digite o ${i}º número: ")
        val num = readln().toIntOrNull() ?: 0
        soma += num
    }
    println("A soma total é: $soma")
}
