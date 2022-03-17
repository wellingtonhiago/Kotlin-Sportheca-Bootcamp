package one.dio.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
    ): Funcionario(nome, cpf, salario), Logavel {

    override fun calcularAuxilio(): Double = salario * 0.4
    override fun login(): Boolean = "mark5" == senha

}