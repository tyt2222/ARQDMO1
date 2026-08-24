package Repeticao

fun main() {
    print("Digite um número N: ")
    val n = readln().toIntOrNull() ?: 0
    for (i in 1..n) {
        println("#".repeat(i))
    }
}
