fun main() {
    print("Masukkan Nama Pekerjaan : ")
    val namaPekerjaan: String = readln()
    print("Masukkan gajih : ")
    val gajih: Double = readln().toDouble()
    print("Masukkan hari kerja : ")
    val hariKerja: String = readln()

    println("")
    val pekerjaan = Pekerjaan(namaPekerjaan, gajih, hariKerja)
    pekerjaan.deskripsiPekerjaan()


}

class Pekerjaan(
    val namaPekerjaan: String,
    val gajih: Double,
    val hariKerja: String
){
    init {
        println("Objek Pekerjaan Telah dibuat")
    }

    fun deskripsiPekerjaan() : Unit{
        println("""
            ====== Deskripsi Pekerjaan ======
            Nama Pekerjaan : $namaPekerjaan
            Gajih          : Rp. $gajih
            Hari Kerja     : $hariKerja
        """.trimIndent())
    }
}