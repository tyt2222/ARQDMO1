open class Pessoa {
    //Propriedades de uma pessoa
    var cpf: String = ""
    var nome: String = ""
    var email: String = ""

    constructor(nome: String, cpf: String, email: String) {
        this.cpf = cpf
        this.nome = nome
        this.email = email
    }

    constructor() {

    }

    //Função (metodo) herdável
    open fun andar(){
        println("Pessoa andando...")
    }
}