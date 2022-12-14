fun main() {
    val str = readLine()!!.toString()
    for (i in str.indices) {
        print("${str[i]}" + "${str[i]}")
    }
}
