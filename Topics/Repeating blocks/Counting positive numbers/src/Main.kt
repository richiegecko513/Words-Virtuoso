fun main() {
    val n = readLine()!!.toInt()
    var sum = 0

    repeat(n) {
        val next = readLine()!!.toInt()
        if (next > 0) sum++
    }
    print(sum)
}