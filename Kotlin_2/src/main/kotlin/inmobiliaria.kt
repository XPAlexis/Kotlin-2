fun main() {
    val houses = listOf(
        House(2000, 100, 3, true, 'A'),
        House(2011, 60, 2, true, 'B'),
        House(1980, 120, 4, false, 'A'),
        House(2005, 75, 3, true, 'B'),
        House(2015, 90, 2, false, 'A')
    )

    println(price(houses, 250000000.0))
}

class House(var y: Int, var m: Int, var h: Int, var g: Boolean, var z: Char)

fun price(houses: List<House>, price: Double): List<Pair<String, Double>> {
    val priceHouses: MutableList<Pair<String, Double>> = mutableListOf()
    var p = 0.0
    for (i in houses.indices) {
        if (houses[i].z == 'A') {
            p = if (houses[i].g) {
                ((houses[i].m * 1000 + houses[i].h * 5000 + 15000) * (2022 - houses[i].y / 100)).toDouble()
            } else {
                ((houses[i].m * 1000 + houses[i].h * 5000) * (2022 - houses[i].y / 100)).toDouble()
            }
        } else if (houses[i].z == 'B') {
            p = if (houses[i].g) {
                (houses[i].m * 1000 + houses[i].h * 5000 + 15000) * (2022 - houses[i].y / 100) * 1.5
            } else {
                (houses[i].m * 1000 + houses[i].h * 5000) * (2022 - houses[i].y / 100) * 1.5
            }
        }
        if (p <= price) {
            val cad= "Habitaciones: "+houses[i].h.toString()+", "+"Año: "+houses[i].y.toString()+", "+"Garage: "+houses[i].g.toString()+", "+"Zona: "+houses[i].z.toString()+", "+"Metros: "+houses[i].m.toString()
            priceHouses.add(Pair(cad, p))
        }
    }
    return priceHouses
}