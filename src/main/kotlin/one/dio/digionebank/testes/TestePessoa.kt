package one.dio.digionebank.testes

import one.dio.digionebank.Funcionario
import one.dio.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    // Instanciando classe Pessoa
    val thanos = Pessoa(nome = "Thanos", cpf = "222.222.222-34")
    println(thanos.nome)
    println(thanos.cpf)

    val tony = Funcionario("Tony Stark", "342.342.342-42", BigDecimal.valueOf(20000))
    println(tony.nome)
    println(tony.cpf)
    println(tony.salario)


}