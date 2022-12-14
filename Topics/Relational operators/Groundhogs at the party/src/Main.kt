const val FIFTEEN = 15
const val TWENTY = 20
const val TEN = 10
const val TWENTY_FIVE = 25
fun main() {

    val amount = readLine()!!.toInt()
    val isWeekend = readLine()!!.toBoolean()
    val rangeNorm = amount >= TEN && amount <= TWENTY
    val rangeWeekend = amount >= FIFTEEN && amount <= TWENTY_FIVE
    println(!isWeekend && rangeNorm || isWeekend && rangeWeekend)
}
