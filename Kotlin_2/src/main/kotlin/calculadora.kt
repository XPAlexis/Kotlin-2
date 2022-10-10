import kotlin.math.*

fun main() {

    print("Ingresa el valor: ")
    val n = readLine()!!.toInt()
    println()
    println("Ingresa la función a aplicar\nSeno (s)\nCoseno (c)\nTangente (t)\nExponencial (e)\nLogaritmo (l)")
    val o = readLine().toString()

    calculator(o, n)


}

fun calculator(ope: String, value: Int) {

    for (i in 1..value) {
        val v=
            when (ope) {
                "s" -> sin(i.toDouble())
                "c" -> cos(i.toDouble())
                "t" -> tan(i.toDouble())
                "e" -> exp(i.toDouble())
                "l" -> ln(i.toDouble())
                else -> 0.0
            }
        if(v<0){
            println("$i -> $v")
        }else{
            println("$i ->  $v")
        }
    }
}