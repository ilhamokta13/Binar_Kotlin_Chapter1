package KonsepSolid

open class Mobil(open val merk: String, open val model: String, open val tahun: Int) {
    fun startEngine() {
        println("Mesin ${this.merk} ${this.model} (${this.tahun}) telah dinyalakan!")
    }
}

class Sedan(override val merk: String, override val model: String, override val tahun: Int) : Mobil(merk, model, tahun)

class SUV(override val merk: String, override val model: String, override val tahun: Int) : Mobil(merk, model, tahun)

fun main() {
    val sedan = Sedan("Toyota", "Camry", 2022)
    sedan.startEngine()

    val suv = SUV("Honda", "CR-V", 2021)
    suv.startEngine()
}
