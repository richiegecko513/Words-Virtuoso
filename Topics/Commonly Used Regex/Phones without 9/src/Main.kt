fun main() {
    val phoneText = readLine()!!
    val phoneReq = Regex("""\(?[0-8]{3}\)?-?[0-8]{3}-?[0-8]{4}""")
    val phones = phoneReq.findAll(phoneText)
    for (phone in phones) {
        println(phone.value)
    }
}