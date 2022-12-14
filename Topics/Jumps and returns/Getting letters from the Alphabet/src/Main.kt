import java.io.File
fun main() {
    val fileName = "C:/Users/richa/Downloads/words_sequence.txt"
    val lines = File(fileName).readLines()
    val longest = lines.maxByOrNull { it.length }
    if (longest != null) {
        print(longest.length)
    }

}