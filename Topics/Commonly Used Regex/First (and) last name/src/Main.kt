fun main() {
    val str = readLine()!!
    val nameDetector = Regex("""([A-Z]{1}[a-z]+)([\s][A-Z]{1}[a-z]+)*""")
    val names = nameDetector.findAll(str)
    for (name in names) {
            println(name.value)
        }
    }
