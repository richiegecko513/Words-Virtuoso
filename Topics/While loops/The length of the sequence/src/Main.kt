fun main() {
    var count = 0
    do {
        val n = readLine()!!.toInt()
        count++
    } while (n > 0)
    println(count - 1)
}