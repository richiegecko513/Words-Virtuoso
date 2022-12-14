import kotlin.random.Random

fun generateTemperature(seed: Int): String{
    val randomGenerator = Random(seed)
    val temperatures = List(7) { (20..30).random(randomGenerator) }
    return temperatures.joinToString(separator = " ")
}