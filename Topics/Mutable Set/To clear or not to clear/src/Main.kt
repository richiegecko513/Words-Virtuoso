fun solution(elements: MutableSet<Int>, element: Int): MutableSet<Int> {
    val emptySet = mutableSetOf<Int>()
    return if (elements.contains(element)) {
        emptySet
    } else {
        elements
    }
}