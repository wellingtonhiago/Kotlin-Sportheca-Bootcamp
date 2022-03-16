package one.dio.digionebank

// Classe Pessoa
class Pessoa {
    // Atributos
    val nome: String = "Thanos"
    var cpf: String = "222.222.222-33"
        private set

    constructor()

    // Função
    fun pessoaInfo() = "$nome e $cpf"

    // Classe interna
    inner class Endereco{
        val planeta: String = "Planeta Titã"
    }

}

fun main() {
    // Instanciando classe Pessoa
    val thanos = Pessoa()
    println(thanos.nome)
    println(thanos.cpf)

    // Chamando classe interna Endereco
    println(thanos.Endereco().planeta)

    // Chamando a Função pessoaInfo
    println(thanos.pessoaInfo())

}