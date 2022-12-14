fun main() {
    val regex = Regex("""(\d{4}|\b\d{2})\.\d{2}\.\d{2}""")
    val text = readLine()!!
    val dates = regex.findAll(text)
    for (date in dates) {
        println(date.value)
    }
}