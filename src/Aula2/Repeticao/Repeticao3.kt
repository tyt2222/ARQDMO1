package Repeticao

import kotlin.random.Random

fun main() {
    val segredo = Random.nextInt(1, 101)
    var tentativas = 10
    var acertou = false
    
    println("Tente adivinhar o número entre 1 e 100. Você tem 10 tentativas.")
    
    while (tentativas > 0 && !acertou) {
        print("Tentativa restante(s): $tentativas. Digite seu palpite: ")
        val palpite = readln().toIntOrNull() ?: 0
        
        if (palpite == segredo) {
            acertou = true
            println("Parabéns! Você acertou!")
        } else if (palpite > segredo) {
            println("O número é menor.")
        } else {
            println("O número é maior.")
        }
        tentativas--
    }
    
    if (!acertou) {
        println("Suas tentativas esgotaram. O número correto era $segredo.")
    }
}
