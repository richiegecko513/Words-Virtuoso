// TODO: provide three functions here
fun identity(x: Int) = x
fun half(x: Int) = x / 2
fun zero(x: Int) = 0
fun generate(functionName: String): (Int) -> Int {
    return if (functionName == "identity") {
        ::identity
    } else if (functionName == "half") {
        ::half
    } else {
        ::zero
    }
}
