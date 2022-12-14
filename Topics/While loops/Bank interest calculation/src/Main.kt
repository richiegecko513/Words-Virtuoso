fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0
    //
    while (deposit < max) {
        deposit *= interestRate
        years++
    }
    //
    return years
}

fun main() {
    val seven = 7.0
    val five = 5

    val toShort = seven.toShort()
}