package one.dio.digionebank

// Classe Pessoa
class Pessoa {
    // Atributos
    val nome: String = "Thanos"
    var cpf: String = "222.222.222-33"
        private set

    constructor()

    // Função
    fun pessoaInfo() = "Nome: $nome, CPF: $cpf"

    // Classe interna
    inner class Endereco{
        val planeta: String = "Planeta Titã"
    }

}

