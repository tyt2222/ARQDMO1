import kotlin.random.Random

fun main() {
    val x = Random.nextInt(1, 9)
    val y = Random.nextInt(1, 9)
    println("Coordenadas geradas: ($x, $y)")
    if ((x + y) % 2 == 0) {
        println("Casa preta")
    } else {
        println("Casa branca")
    }
}
