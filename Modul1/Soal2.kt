fun main() {
    print("nilai x = ")
    val x: Int = readln().toInt()
    val hasil: Int = operasi(x)
    println("Hasil f($x) = 2x^2 + 5x - 8 adalah $hasil")
}

fun operasi(x: Int) : Int = 2 * x * x + 5 * x - 8