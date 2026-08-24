data class Cliente(val nome: String, val email: String)

data class Cupom(val porcentagem: Double) {
    init {
        require(porcentagem > 0.0 && porcentagem <= 100.0)
    }
}

abstract class Produto(val nome: String, val preco: Double) {
    open fun calcularFrete(): Double {
        return 0.0
    }
    
    abstract fun entregar(cliente: Cliente)
}

class LivroFisico(nome: String, preco: Double, val pesoKg: Double) : Produto(nome, preco) {
    override fun calcularFrete(): Double {
        return pesoKg * 5.0
    }

    override fun entregar(cliente: Cliente) {
        println("Enviando livro $nome para ${cliente.nome}.")
    }
}

class Console(nome: String, preco: Double, val pesoKg: Double) : Produto(nome, preco) {
    override fun calcularFrete(): Double {
        return pesoKg * 5.0
    }

    override fun entregar(cliente: Cliente) {
        println("Enviando console $nome para ${cliente.nome}.")
    }
}

class JogoTabuleiro(nome: String, preco: Double, val pesoKg: Double) : Produto(nome, preco) {
    override fun calcularFrete(): Double {
        return pesoKg * 5.0
    }

    override fun entregar(cliente: Cliente) {
        println("Enviando jogo de tabuleiro $nome para ${cliente.nome}.")
    }
}

class LivroDigital(nome: String, preco: Double) : Produto(nome, preco) {
    override fun entregar(cliente: Cliente) {
        println("Enviando livro digital $nome para o e-mail: ${cliente.email}")
    }
}

class FilmeDigital(nome: String, preco: Double) : Produto(nome, preco) {
    override fun entregar(cliente: Cliente) {
        println("Filme $nome liberado no player online para ${cliente.nome}.")
    }
}

class JogoDigital(nome: String, preco: Double) : Produto(nome, preco) {
    override fun entregar(cliente: Cliente) {
        println("Enviando jogo digital $nome para o e-mail: ${cliente.email}")
    }
}

class Pedido(val cliente: Cliente, val cupom: Cupom? = null) {
    private val itens = mutableListOf<Produto>()

    fun adicionarItem(produto: Produto) {
        itens.add(produto)
    }

    fun fecharPedido() {
        var subtotal = 0.0
        var valorFrete = 0.0

        println("--- Resumo do Pedido de ${cliente.nome} ---")
        
        itens.forEach { 
            println("- ${it.nome} (R$ ${it.preco})")
            subtotal += it.preco
            valorFrete += it.calcularFrete()
            it.entregar(cliente)
        }

        val valorDesconto = if (cupom != null) subtotal * (cupom.porcentagem / 100) else 0.0
        val valorFinal = (subtotal - valorDesconto) + valorFrete

        println("Subtotal: R$ $subtotal")
        if (cupom != null) {
            println("Desconto: R$ $valorDesconto")
        }
        println("Frete: R$ $valorFrete")
        println("Valor Final: R$ $valorFinal")
    }
}

fun main() {
    val cliente = Cliente("Fabio", "fabio.paiva.dev@gmail.com")
    val cupom = Cupom(15.0)
    
    val pedido = Pedido(cliente, cupom)
    
    pedido.adicionarItem(LivroFisico("Fundamentos java", 150.0, 1.0))
    pedido.adicionarItem(Console("Nintendo Switch", 2500.0, 1.5))
    pedido.adicionarItem(FilmeDigital("Titanic", 25.0))
    pedido.adicionarItem(JogoDigital("Stardew Valley", 30.0))
    
    pedido.fecharPedido()
}
