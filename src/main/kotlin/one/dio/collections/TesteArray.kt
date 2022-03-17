package one.dio.collections

fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 5
    values[2] = 9
    values[3] = 4
    values[4] = 3

    // iterando com for
    for (valor in values){
        print("[$valor]")
    }

    println()

    // iterando com forEach
    values.forEach {
        print("[$it]")
    }

    println()

    // iterando passando a variavel no forEach
    values.forEach { valor ->
        print("[$valor]")
    }

    println()

    // sort sendo usado, ele ordena do menor para o maior
    values.sort()
    for (valor in values){
        print("[$valor]")
    }
}