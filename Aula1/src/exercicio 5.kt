fun main(){
    println("Digite uma temparatura em celsius");
    var celsius: Double = readln().toDouble();

    println("digite 1 para trasforma-la em fahrenheit ou 2 para trasnforma-la em kelvin");
    var opt: Int = readln().toInt();

    if(opt == 1){
        println("temperatura em fahrenheit = " + ((celsius * 9 / 5) + 32));
    }else if(opt == 2){
        println("temperatura em fahrenheit = " + (celsius + 273.15));
    }else{
        println("opcao nao valida selecionada");
    }


}