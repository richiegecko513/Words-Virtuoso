fun main() {
    var sum = 0
    do {
        var n = readLine()!!.toInt()
        sum += n
    } while (n > 0)
    println(sum)
}