fun main() {
    val text = readLine()!!
    val regexColors = "#[0-9a-fA-F]{6}\\b".toRegex()
    val colors = regexColors.findAll(text)
    for (color in colors)
        println(color.value)
    // write your code here
}