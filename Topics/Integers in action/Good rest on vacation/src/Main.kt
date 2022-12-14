fun main() {
    val duration = readLine()!!.toInt()
    val foodCost = readLine()!!.toInt()
    val flightCost = readLine()!!.toInt() * 2
    val hotelCost = readLine()!!.toInt()

    val totalHotelCost = (duration - 1) * hotelCost
    val totalFoodCost = duration * foodCost

    println(totalHotelCost + totalFoodCost + flightCost)
}