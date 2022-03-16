package one.dio.digionebank.testes

import one.dio.digionebank.Pessoa

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