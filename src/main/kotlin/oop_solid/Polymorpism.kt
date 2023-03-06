package oop_solid

fun main(){
    val buah = Buah()
    buah.deskripsi("Apel")

}

class Buah(){
    //method overloading : function
    fun deskripsi(name : String){
        println("nama buah : $name")
    }

    fun deskripsi(warna : String, vit:String){

    }
}

//method overriding
