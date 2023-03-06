package oop_solid

// public - private - protected - internal


fun main(){
    val mhs = Mahasiswa()
    println(" Nim : ${mhs.nim}")
    val fsw = FswClass()
    fsw.exPublic()
    fsw.exInternal()

}

// public - private - protected - internal
open class Mahasiswa {
    var  name : String = "Dwiki"
    private var age : Int =21 // yg bisa akses hanya class yang sama
    open protected var address : String = "Depok" // class dan sub class
    internal var nim :String = "8357265" // class yg sama / 1 project

}





class AndroidClass():Mahasiswa(){
//    val andclass = Mahasiswa()
//        get() = super.address
//        set(value) {}

}

class FswClass(){
    fun exPublic() {

    }

    private fun exPrivate(){

    }

    protected fun exProtected(){

    }

    internal fun exInternal(){

    }
}

private class Myclass(){

}



internal class MyClass4(){

}

