import kotlin.math.hypot

fun perimeter(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double = 0.0, y4: Double = 0.0): Double {
    val coord1 = Pair(x1, y1)
    val coord2 = Pair(x2, y2)
    val coord3 = Pair(x3, y3)
    val coord4 = Pair(x4, y4)

    var length1 = 0.0
    var length2 = 0.0
    var length3 = 0.0
    var length4 = 0.0
    return if (coord4 == Pair(0.0, 0.0)) {
        length1 = findDistance(coord1, coord2)
        length2 = findDistance(coord2, coord3)
        length3 = findDistance(coord3, coord1)
        length1 + length2 + length3
    } else {
        length1 = findDistance(coord1, coord2)
        length2 = findDistance(coord2, coord3)
        length3 = findDistance(coord3, coord4)
        length4 = findDistance(coord4, coord1)
        length1 + length2 + length3 + length4
    }

}

fun findDistance(coord1: Pair<Double, Double>, coord2: Pair<Double, Double>): Double {
    return hypot(coord2.first - coord1.first, coord2.second - coord1.second)
}