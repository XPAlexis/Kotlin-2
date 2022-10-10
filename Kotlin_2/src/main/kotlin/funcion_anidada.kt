fun main() {
    var valores= listOf(10,15,22,56,48,18,3,10,7,100,96,27,8)
    println(valores)
    println("Valores mayores a 50")
    println(condicion(valores) { a -> mayores(a) })
}


fun mayores(valor:Int): Boolean {

    return valor>50
}

fun condicion(valores: List<Int>,par:(Int)->Boolean):List<Pair<Int,Boolean>> {
    val words: MutableList<Pair<Int, Boolean>> = mutableListOf()
    for (i in valores.indices) {
        if (par(valores[i])){
            words.add(Pair(valores[i], par(valores[i])))
        }
    }
    return words
}