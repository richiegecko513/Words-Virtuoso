fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val fourth = readLine()!!.toInt()
    val fifth = readLine()!!.toInt()

    val range1 = first..second
    val range2 = third..fourth

    val within = fifth in range1 || fifth in range2
    print(within)
}