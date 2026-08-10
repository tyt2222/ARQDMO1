import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val x1 = DoubleArray(2);
    val x2 = DoubleArray(2);

    println("Digite as posicoes do primeiro alvo :")

    for (i in x1.indices) {
        x1[i] = readln().toDouble();
    }

    println("Digite as posicoes do segundo alvo :")

    for (i in x2.indices) {
        x2[i] = readln().toDouble();
    }

    val distancia = sqrt((x2[0] - x1[0]).pow(2.0) + (x2[1] - x1[1]).pow(2.0));

    if (distancia <= 5){
        println("[ENTRAR NO MODO ATAQUE]");
    }

}
