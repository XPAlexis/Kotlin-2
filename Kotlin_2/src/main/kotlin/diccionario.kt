fun main(args: Array<String>) {
    val calificaciones= mutableListOf<Int>(95,100,55,34,89,98,79,65,70)
    var a= mutableListOf<String>()
    println(Resultados(calificaciones,a))


}
private fun Resultados(calificaciones: MutableList<Int>,a: MutableList<String>): MutableList<String> {


    for (i in calificaciones)
    {
        if (i <=100 && i >=95){
            a.add(i.toString())
            a.add("Excelente")
        }else if (i <=94 && i >=85){
            a.add(i.toString())
            a.add("Notable")
        }
        else if (i <=84 && i >=75){
            a.add(i.toString())
            a.add("Bueno")
        }
        else if (i <=74 && i >=70){
            a.add(i.toString())
            a.add("Suficiente")
        } else if (i<70){
            a.add(i.toString())
            a.add("Insuficiente")
        }
    }
    return a
}