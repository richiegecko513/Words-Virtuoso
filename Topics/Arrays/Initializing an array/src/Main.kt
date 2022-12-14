fun main() {
    val numbers = IntArray(100)
    numbers[0] = 1
    numbers[9] = 10
    numbers[numbers.size - 1] = 100

    // do not touch the lines below
    println(numbers.joinToString())
}