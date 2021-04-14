import kotlin.math.sqrt
fun main() {

    val a = 15.0
    val b = 11.0
    val c = 16.0
    quadratic(a, b, c)


}
fun quadratic(a: Double, b: Double, c: Double) {
    val determinant = b * b - 4 * a * c
    val x1: Double
    val x2: Double
    val output: String
    when {
        determinant > 0 -> {
            x1 = (-b + sqrt(determinant)) / (2 * a)
            x2 = (-b - sqrt(determinant)) / (2 * a)

            output = "x1 = %.2f and x2 = %.2f".format(x1, x2)
        }
        determinant == 0.0 -> {
            x2 = -b / (2 * a)
            x1 = x2

            output = "x1 = x2 = %.2f;".format(x1)
        }
        else -> {
            val realPart = -b / (2 * a)
            val imaginaryPart = sqrt(-determinant) / (2 * a)

            output = "x1 = %.2f+%.2f and x2 = %.2f-%.2f".format(realPart, imaginaryPart, realPart, imaginaryPart)
        }
    }

    println(output)
}



