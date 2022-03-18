package one.dio.collections

fun main() {
    val saitama = Funcionario(nome = "Saitama", salario = 5000.0, contratacao = "CLT")
    val goku = Funcionario(nome = "Goku", salario = 4000.0, contratacao = "PJ")
    val seiya = Funcionario(nome = "Seiya", salario = 500.0, contratacao = "CLT")

    val funcionarios = listOf(saitama, goku, seiya)
    funcionarios.forEach { println(it) }

    println("------------------")
    // retorna o funcionario Seiya
    println(funcionarios.find { it.nome == "Seiya" })

    println("------------------")
    // Ordenar a lista funcionarios por salário
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("------------------")
    // Agrupar por grupos
    funcionarios
        .groupBy { it.contratacao }
        .forEach { println(it) }

    println("----------------")
    // Quantidade de grupos por contratação
    println(funcionarios.groupBy { it.contratacao }.count())

    // Quantidade de cada grupo de contratação
    println(funcionarios.groupingBy { it.contratacao }.eachCount())

}
