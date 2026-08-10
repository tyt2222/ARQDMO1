fun main(){

    println("Digite um numero:");
    var num = readln()?.toIntOrNull();
    if(num != null){
        if( num % 2 == 0){
            println("par");
        }
        else{
            println("impar");
        }
    }else{
        println("valor nulo");
    }

}