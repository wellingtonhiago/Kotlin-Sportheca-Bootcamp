package one.dio.digionebank.testes

import one.dio.digionebank.Autenticacao
import one.dio.digionebank.Cliente
import one.dio.digionebank.ClienteTipo

fun main() {
    val hulck = Cliente(
        nome = "O incrível Hulck",
        cpf = "999.999.999-99",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(hulck)
    Autenticacao().autenticacao(hulck)
}