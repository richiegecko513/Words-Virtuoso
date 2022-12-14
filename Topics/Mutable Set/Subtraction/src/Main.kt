fun solution(elements: Set<String>, element: String): MutableSet<String> {
    val mSet: MutableSet<String> = elements.toMutableSet()
    mSet.remove(element)
    return mSet
}
