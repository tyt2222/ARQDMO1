fun main() {
    val numeros = DoubleArray(2);

    println("Digite dois números :")

    for (i in numeros.indices) {
        numeros[i] = readln().toDouble();
    }

    println("Digite a operação: + - * /");
    val escolha = readln();

    var resultado = 0.0;

    if (escolha == "+"){
        resultado = numeros[0] + numeros[1];
    }

    if (escolha == "-"){
        resultado = numeros[0] - numeros[1];
    }

    if (escolha == "*"){
        resultado = numeros[0] * numeros[1];
    }

    if (escolha == "/"){
        resultado = numeros[0] / numeros[1];
    }

    println("O resultado é: $resultado");
}
