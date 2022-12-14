fun main() {
    val n = readLine()!!.toInt()
    val numbers = MutableList<String>(n) { readLine()!!.toString() }
    val lastLine = readLine()?.split(" ")?.map { it.toString() }?.toMutableList()
    val p = lastLine?.first()
    val m = lastLine?.last()
    var output: Int = 0
    for (i in numbers.indices) {
        if (i != numbers.lastIndex) {
            if (numbers[i] == p && (numbers[i + 1] == m || numbers[i - 1] == m)) {
                output++
            }
            if (i.toString() != p && i.toString() == m && ((i + 1).toString() == p || (i - 1).toString() == p)) {
                println(i)
                output++
            }
        }
    }
    if (output > 0) {
        println("NO")
    } else if (output == 0) {
        println("YES")
    }
    /*
    val listIterator = numbers.listIterator()
    listIterator.forEach {
        if (listIterator.hasNext()) {
            if (it == p && (listIterator.next() == m || listIterator.previous() == m)) {
                output++
            }
            if (it != p && it == m && (listIterator.next() == p || listIterator.previous() == p)) {
                output++
            }
        }
    }
    if (output > 0) {
        println("NO")
    } else if (output == 0) {
        println("YES")
    }

     */
}