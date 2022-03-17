package one.dio.digionebank

class Gerente(nome: String, cpf: String, salario: Double): Funcionario(nome, cpf, salario) {
    override fun calcularAuxilio(): Double = salario * 0.4
    }