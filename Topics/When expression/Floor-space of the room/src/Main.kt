fun main(args: Array<String>) {
    val pi = 3.14 // Malevians use 3.14 for pi
    val shape = args[0] // The first argument is the shape of the room
    val dimensions = args.drop(1).map { it.toDouble() } // The remaining arguments are the dimensions of the room

    val area = when (shape) {
        "triangle" -> {
            val base = dimensions[0]
            val height = dimensions[1]
            0.5 * base * height
        }
        "rectangle" -> {
            val length = dimensions[0]
            val width = dimensions[1]
            length * width
        }
        "circle" -> {
            val radius = dimensions[0]
            pi * radius * radius
        }
        else -> 0.0 // Handle invalid shape
    }

    println(area)
}
