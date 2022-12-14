fun main() {
    val n = readln().toInt()
    val numbers = IntArray(n) { readln().toInt() }
    val lastLine = readln().split(" ").map { it.toInt() }
    val p = lastLine[0]
    val m = lastLine[1]
    val result = if (numbers.contains(p) && numbers.contains(m)) "YES" else "NO"
    print(result)
}