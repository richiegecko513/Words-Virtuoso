fun solution(first: Set<String>, second: MutableList<String>): Boolean {
    return second.all { first.contains(it) }
}
