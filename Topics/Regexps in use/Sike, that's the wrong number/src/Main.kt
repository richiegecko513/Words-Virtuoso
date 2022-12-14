fun main() {
    val number = readLine()!!
    // write your code here
    val regex = "[a-zA-Z]".toRegex()
    val newNumber = number.replace(regex,"")
    println(newNumber)
}