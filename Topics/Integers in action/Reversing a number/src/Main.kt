fun main() {
    val num = readLine()!!.toInt()
    val a = num % 10
    val b = num % 100 / 10
    val c = num / 100
    print("$a$b$c")

    // put your code here
}