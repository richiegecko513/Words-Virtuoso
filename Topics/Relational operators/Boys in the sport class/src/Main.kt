fun main() {
    val h1 = readLine()!!.toInt()
    val h2 = readLine()!!.toInt()
    val h3 = readLine()!!.toInt()
    val ascending = h1 >= h2 && h2 >= h3
    val descending = h1 <= h2 && h2 <= h3
    val equal = h1 == h2 && h2 == h3
    println(ascending || descending || equal)
}
