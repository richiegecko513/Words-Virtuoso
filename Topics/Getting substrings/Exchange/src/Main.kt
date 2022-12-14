fun main() {
    val word = readLine()!!.toString()
    println("${word.last()}" + word.substring(1,word.length -1) + "${word.first()}")
}