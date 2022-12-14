const val LIMIT = 3
fun main() {
    val vowels = mutableListOf('a', 'e', 'i', 'o', 'u', 'y')
    val word = readLine()!!.toString().toMutableList()
    var count = 0
    var vowelCount = 0
    var conCount = 0
    for (i in word) {
        if (i in vowels) {
            conCount = 0
            vowelCount++
            if (vowelCount == LIMIT) {
                count++
                conCount = 1
                vowelCount = 1
            }
        } else {
            vowelCount = 0
            conCount++
        }
        if (conCount == LIMIT) {
            count++
            conCount = 1
            vowelCount = 1
        }
    }
    println(count)
}