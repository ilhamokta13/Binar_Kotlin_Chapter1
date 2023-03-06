package oop_solid

// tidak bisa dibikinkan objeknya

abstract class Dosen(){
    abstract fun namaDosen()
    fun jumlahMatkulAjar(){
        println("Jumlah Matkul yang diajar : 2")
     }

}
class Matkul(): Dosen(){
    override fun namaDosen() {
        println(" Nama Dosen : Andika")
    }
}

fun main(){
    // val dosen = Dosen()
    val matkul = Matkul()
    matkul.namaDosen()
    matkul.jumlahMatkulAjar()

}

//abstract class person(){
//    abstract fun namaPerson()
//}