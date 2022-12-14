fun main() {
    val first = readln().toInt()
    val second = readln().toInt()
    val third = readln().toInt()
    val fourth = readln().toInt()
    val fifth = readln().toInt()

    val range1 = first..second
    val range2 = third..fourth
    val within = fifth in range1 && fifth in range2
    print(within)
}