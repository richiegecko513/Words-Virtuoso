fun main() {
    val num = readLine()!!.toString()
    val sub1 = num.substring(0, 3)
    val sub2 = num.substring(num.length - 3)
    var sum1 = 0
    var sum2 = 0
    for (i in sub1) {
        sum1 += i.code
    }
    for (i in sub2) {
        sum2 += i.code
    }
    if (sum1 == sum2) {
        println("Lucky")
    } else if (sum1 != sum2) {
        println("Regular")
    }

}
