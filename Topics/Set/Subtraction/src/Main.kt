fun solution(numbers1: Set<Int>, numbers2: Set<Int>): Int {
    val numbers3 = numbers1 - numbers2
    return numbers3.size
}