package Condicionais

fun main() {
    val numeros = IntArray(3);

    println("Digite três números inteiros:")

    for (i in numeros.indices) {
        numeros[i] = readln().toInt();
    }

    var menor = numeros[0]

    for (i in 0 until numeros.size) {
        if (numeros[i] < menor) {
            menor = numeros[i]
        }
    }

    println("O menor valor é: $menor")
}
