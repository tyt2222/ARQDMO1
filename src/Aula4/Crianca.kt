package Aula4

class Crianca: Pessoa(), SerVivo {
    var dentesDeLeite: String = ""
    var reuPrimario: Boolean = true
    override var temCoracao: String = "Sim"
    override var categoria: String = "Onívoro"
    override var habitat: String = "Em vários lugares!"

    //Sobrescrevendo a função andar de Pessoa
    override fun andar() {
        //super.andar()
        println("Engatinhando...")
    }

    override fun som() {
        println("Birra, chora, sorri, brinca...")
    }

    override fun mover() {
        println("Andando (depois que se aprende")
    }

    override fun respirar() {
        println("Respira oxigênio")
    }

}