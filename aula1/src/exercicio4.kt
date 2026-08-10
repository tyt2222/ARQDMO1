fun main(){

    println("digite 3 notas");

    var num1: Double = readln().toDouble();
    var num2: Double = readln().toDouble();
    var num3: Double = readln().toDouble();

    var media = (num1 + num2 + num3) / 3;

    println("A media do aluno é: "+media);

    if(media >= 6){
        println("aluno aprovado");
    }else if(media >=4){
        println("aluno de recuperacao");
    }else{
        println("aluno de reprovado");
    }


}