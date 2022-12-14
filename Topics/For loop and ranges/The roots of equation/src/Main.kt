const val Z = 0
const val THOUS = 1000
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()

    for (x in Z..THOUS) {
        if (a * x * x * x + b * x * x + c * x + d == 0)
            {
                println(x)
            }
    }
}
