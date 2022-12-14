// write your code here
fun getLastDigit(a: Int): Char {
    val str = a.toString()
    return str[str.length - 1]
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}