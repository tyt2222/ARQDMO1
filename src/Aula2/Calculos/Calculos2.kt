package Calculos

fun main() {
    print("Digite uma palavra: ")
    val palavra = readln()
    val invertida = palavra.reversed()
    if (palavra.equals(invertida, ignoreCase = true)) {
        println("A palavra '$palavra' é um palíndromo.")
    } else {
        println("A palavra '$palavra' não é um palíndromo.")
    }
}
