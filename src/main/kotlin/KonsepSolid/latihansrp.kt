package KonsepSolid

open class OperasiMatematika {
    open fun hitung(x: Int, y: Int): Int {
        return x + y
    }
}

class Penjumlahan : OperasiMatematika() {
    override fun hitung(x: Int, y: Int): Int {
        return x + y
    }
}

class Pengurangan : OperasiMatematika() {
    override fun hitung(x: Int, y: Int): Int {
        return x - y
    }
}

fun main() {
    val penjumlahan = Penjumlahan()
    println("Penjumlahan 5 + 3 = ${penjumlahan.hitung(5, 3)}")

    val pengurangan = Pengurangan()
    println("Pengurangan 5 - 3 = ${pengurangan.hitung(5, 3)}")
}

