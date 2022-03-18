package one.dio.collections

data class Funcionario(
    val nome: String,
    val salario: Double,
    val contratacao: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
            
        """.trimIndent()
}