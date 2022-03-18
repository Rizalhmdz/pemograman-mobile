import java.lang.Math.random

fun main() {
    print("Waktu Sekarang : ")
    val waktu: String = readln()
    print("Nama Anda : ")
    val nama : String = readln()
    print("Umur Anda : ")
    val umur : Int = (35 .. 37).random().toInt()
    println(umur)
    print("Suhu Tubuh Anda: ")
    val suhu : Double = readln().toDouble()

    println("""
        Selamat $waktu, $nama.
        Umur anda $umur.
        Suhu tubuh anda $suhu derajat.
    """.trimIndent())
}