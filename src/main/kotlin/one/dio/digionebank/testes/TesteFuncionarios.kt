package one.dio.digionebank.testes

import one.dio.digionebank.Analista
import one.dio.digionebank.Funcionario
import one.dio.digionebank.Gerente
import java.math.BigDecimal

fun main() {
    val thanos = Analista("Thanos", "232.232.232-33", 20000.0)
    imprimeRelatorio(thanos)

    val tony = Gerente("Tony Stark", "232.232.232-33", 20000.0)
    imprimeRelatorio(tony)


}

fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())