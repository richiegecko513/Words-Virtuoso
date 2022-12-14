import kotlin.random.Random
import kotlin.random.nextInt

fun createDiceGameRandomizer(n: Int): Int {
    var seed = 1
    while (true) {
        val randomGenerator = Random(seed)
        val friendSum = MutableList(n) { (1..6).random(randomGenerator) }.sum()
        val mySum = MutableList(n) { (1..6).random(randomGenerator) }.sum()
        if (friendSum < mySum) {
            return seed
        }
        seed++
    }
}