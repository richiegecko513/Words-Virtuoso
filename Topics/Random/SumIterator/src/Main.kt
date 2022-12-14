import kotlin.random.Random

fun sumInts(): Int {
    var sum: Int = 0
    for (i in 1..100) {
        sum += i
    }
    return sum
}