fun main() {
    //CRIANDO UMA PESSOA
    val p1 = Pessoa("123456789","Theobaldo","theo@gmail.com")
    p1.nome = "Theobaldo"
    p1.cpf = "123456789"
    p1.email = "theo@gmail.com"

    //Usando informações de pessoa
    println("Nome: ${p1.nome}")
    println("Cpf: ${p1.cpf}")
    println("Email: ${p1.email}")
    p1.andar()

    //CRIANDO UMA CRIANCA (filho de uma pessoa)
    val c1 = Crianca()
    c1.nome = "Oswaldo"
    c1.cpf = "987654321"
    c1.reuPrimario = false

    c1.andar()
    c1.respirar()
    c1.som()

    val c2 = Adolescente()
    c2.idioma = "Mandarim"
    c2.praticarHobby()


}