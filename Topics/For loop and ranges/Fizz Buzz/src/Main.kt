fun main() {
    val first = readln().toInt()
    val second = readln().toInt()

    for(i in first..second) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if ( i % 3 == 0 && i % 5 != 0) {
            println("Fizz")
        } else if ( i % 5 == 0 && i % 3 != 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}