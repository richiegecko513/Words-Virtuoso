fun main() {
    val text = readLine()?.split(" ")?.toMutableList()
    val regex = Regex("""(pa)+""")
    if (text != null) {
        for (pa in text) {
            if (pa.contains(regex)) {
                println(pa)
            }
        }
    }

}