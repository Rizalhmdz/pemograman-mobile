fun main() {
    print("Input bilangan = ")
    val bilangan: Int = readln().toInt()
    operasiSoal3(bilangan)
}

fun operasiSoal3(x: Int) : Unit{
    var hasil = mutableListOf<Int>()
    var kelipatan = 1

    while(hasil.size < 5){
        kelipatan++
        val nilai: Int = x * kelipatan
        if(nilai % 2 == 0 || nilai %3 == 0) {
            hasil.add(nilai)
        }
        else continue
    }

    println(hasil)
}
