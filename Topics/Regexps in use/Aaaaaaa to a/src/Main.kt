fun main() {
    val text = readLine()!!
    val newString = text.replace("[a|A]+".toRegex(), "a")
    println(newString)
}
