fun sum5(a1: Int, a2: Int, a3: Int = 0, a4: Int = 0, a5: Int = 0): Int {
    val num: List<Int> = listOf(a1, a2, a3, a4, a5)
    return num.sumOf { it }
}