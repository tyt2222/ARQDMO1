//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var num1 = 12;
    val num2: Int = num1;
    num1 = 55;

    println(num1);
    println(num2);
    // leitura de dados

    println("Digite sua idade:");
    var idade: Int? = readln().toIntOrNull();
    if(idade != null){
        idade += 1;
    }

    println("no ano que vem sua idade sera : " + idade);
}