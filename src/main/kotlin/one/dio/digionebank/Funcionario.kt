package one.dio.digionebank

abstract class Funcionario(
    override val nome: String,
    override val cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calcularAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        Cpf: $cpf
        Salario: $salario
        Auxilio: ${calcularAuxilio()}
        """.trimIndent()
    }