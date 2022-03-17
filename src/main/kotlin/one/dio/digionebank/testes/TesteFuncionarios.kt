package one.dio.digionebank.testes

import one.dio.digionebank.*
import java.math.BigDecimal

fun main() {
    val thanos = Analista("Thanos", "232.232.232-33", 20000.0)
    imprimeRelatorio(thanos)

    println()

    val tony = Gerente("Tony Stark", "232.232.232-33", 20000.0, "mark5")
    imprimeRelatorio(tony)
   Autenticacao().autenticacao(tony)


}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())