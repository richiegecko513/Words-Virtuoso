fun main() {
    // Read array size
    val n = readLine()!!.toInt()

    // Read array elements
    val array = (1..n).map { readLine()!!.toInt() }

    // Read p and m
    val lastLine: Array<Int>? = readLine()?.split(" ")?.map { it.toInt() }?.toTypedArray()
    val p = lastLine?.first()
    val m = lastLine?.last()

    // Check if p and m never occur next to each other in the array
    val result = array.zipWithNext().none { (x, y) -> (x == p && y == m) || (x == m && y == p) }
    if (result) {
        println("YES")
    } else {
        println("NO")
    }
}