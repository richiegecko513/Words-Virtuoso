fun main() {
    val pass = readLine()!!
    val passwordReq = Regex("""[A-Z]+[a-z]+\d+""")
    if (passwordReq.matches(pass)) {
        println("Password saved")
    } else {
        println("Password is too simple")
    }


}