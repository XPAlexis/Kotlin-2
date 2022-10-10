fun main() {
    val kardex: Map<String, Int> = mapOf(
        "matematicas" to 50, "geografia" to 73, "español" to 80, "quimica" to 93, "historia" to 99
    )
    println(calif(kardex))

}

fun calif(notas: Map<String, Int>): Map<String, String> {
    val des: MutableMap<String, String> = mutableMapOf()
    for ((k, v) in notas) {
        val d = when (v) {
            in 0..69 -> "Desempeño insuficiente"
            in 70..74 -> "Suficiente"
            in 75..84 -> "Bueno"
            in 85..94 -> "Notable"
            in 95..100 -> "Excelente"
            else -> " "
        }
        des[k.uppercase()] = d
    }
    return des
}