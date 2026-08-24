package Condicionais

fun main() {
    print("Informe o número: ");

    val numero = readln().toInt();

    if (numero % 2 == 0){
        println("O número é par");
    }else{
        println("O número é impar")
    }


}