fun main() {
    val n = readln().toInt()
    val numbers = IntArray(n) { readln().toInt() }
    val m = readln().toInt()
    var count: Int = 0

    for (i in numbers) {
        if (i == m) {
            count++
        }
    }
    print(count)
}