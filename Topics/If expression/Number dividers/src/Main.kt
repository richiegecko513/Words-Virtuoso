fun main() {
    val n = readln().toInt()

    val divisibleBy2 = if (n % 2 == 0) "Divided by 2\n" else ""
    val divisibleBy3 = if (n % 3 == 0) "Divided by 3\n" else ""
    val divisibleBy5 = if (n % 5 == 0) "Divided by 5\n" else ""
    val divisibleBy6 = if (n % 6 == 0) "Divided by 6\n" else ""

    println("$divisibleBy2$divisibleBy3$divisibleBy5$divisibleBy6")
}