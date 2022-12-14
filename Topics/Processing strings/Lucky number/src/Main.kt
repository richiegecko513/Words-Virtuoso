fun main() {
    val num = readLine()!!.toString()
    val partOne = num.substring(0, num.length / 2)
    val partTwo = num.substring (num.length / 2)
    var sum1 = 0
    var sum2 = 0
    val numSize = num.length
    if (numSize % 2 == 0) {
        for (i in partOne) {
            sum1 += i.code
        }
        for (i in partTwo) {
            sum2 += i.code
        }
        if (sum1 == sum2) {
            print("YES")
        } else if (sum1 != sum2) {
            print("NO")
        }
    } else if (numSize % 2 != 0) {
        print("NO")
    }

}
