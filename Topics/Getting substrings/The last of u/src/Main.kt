fun main() {
    val string = readLine()!!.toString()
    val newString = string.substringAfterLast('u')
    println(string.replace(newString,newString.uppercase()))
}