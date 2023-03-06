package oop_solid

open class Animal (){
    open fun deskripsi(){
        println("deskripsi hewan")
    }

    open fun namaAnimal(nama : String){
        println("nama binatang : $nama")
    }
}

open class Harimau() : Animal(){
    override fun deskripsi() {
        super.deskripsi()
        println (" Deskripsi Harimau")
    }
    fun warnaKulit(){

    }

    fun warnaKulit(a:String){

    }

    override fun namaAnimal(nama: String) {
        super.namaAnimal(nama)
    }
}

class Gajah():Animal(){
    override fun namaAnimal(nama: String) {
        super.namaAnimal(nama)
    }

}

class HarimauSumatra() : Harimau(){
    override fun deskripsi() {
        super.deskripsi()
    }
}