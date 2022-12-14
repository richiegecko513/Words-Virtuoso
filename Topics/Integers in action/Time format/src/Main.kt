fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line

    val seconds = totalSeconds % 60
    val minutes = seconds / 60
    val hours = minutes / 60
    print("$hours:$minutes:$seconds")
    // enter your code
}