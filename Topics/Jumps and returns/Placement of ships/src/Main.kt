fun main() {
    val coord1 = readln().split(" ").map { it.toInt() }
    val coord2 = readln().split(" ").map { it.toInt() }
    val coord3 = readln().split(" ").map { it.toInt() }

    var rows = ""
    var cols = ""

    for (x in 1..5) {
        if ( x == coord1[0] || x == coord2[0] || x == coord3[0]) continue
        rows += x.toString() + " "
    }
    for (y in 1..5) {
        if (y == coord1[1] || y == coord2[1] || y == coord3[1]) continue
        cols += y.toString() + " "
    }
    println(rows.trim())
    println(cols.trim())
}