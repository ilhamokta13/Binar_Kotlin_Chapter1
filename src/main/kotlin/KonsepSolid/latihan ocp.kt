package KonsepSolid

abstract class Dosen(val nama: String, val nip: String) {
    abstract fun hitungGaji(): Double
}

class DosenTetap(nama: String, nip: String, val gajiPokok: Double) : Dosen(nama, nip) {
    override fun hitungGaji(): Double {
        return gajiPokok
    }
}

class DosenKontrak(nama: String, nip: String, val jumlahJam: Int, val tarifJam: Double) : Dosen(nama, nip) {
    override fun hitungGaji(): Double {
        return jumlahJam * tarifJam
    }
}

fun main() {
    val dosenTetap = DosenTetap("Ilham", "2041160055", 1.000000)
    println("${dosenTetap.nama} dengan NIP ${dosenTetap.nip} mendapatkan gaji ${dosenTetap.hitungGaji()}")

    val dosenKontrak = DosenKontrak("Budi", "2654532", 70, 3.000000)
    println("${dosenKontrak.nama} dengan NIP ${dosenKontrak.nip} mendapatkan gaji ${dosenKontrak.hitungGaji()}")
}
