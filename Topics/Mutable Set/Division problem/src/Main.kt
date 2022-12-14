fun solution(first: Set<Int>, second: Set<Int>): Set<Int> {
    val multiple = second.size
    val newSet = mutableSetOf<Int>()
    for (i in first) {
        if (i % multiple == 0) {
            newSet.add(i)
        }
    }
    newSet.toSet()
    return newSet
}
