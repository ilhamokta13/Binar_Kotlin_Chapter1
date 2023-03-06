package classobjectfunprmter

fun main() {


    // deklarasi object
    val rumahA = Rumah()
    rumahA.warnaRumah = "Putih"
    println("Nama Pemilik Rumah : ${rumahA.namaPemilik} ")
    println("Salah saty fungsi rumah A : ${rumahA.tahanPanas()}")
    println("Warna rumah A : ${rumahA.warnaRumah}")

    //object 2
    val rumahB = Rumah()
    rumahB.namaPemilik = "Andika"
    println(rumahB.namaPemilik)
    contohLambFun()

    val sum = {a : Int, b :Int-> a+b}
    val sub = {a: Int, b:Int -> a-b}

    val hitungSum = calculated(12,14,sum)
    val hitungSub = calculated(13,10,sub)
    println("Hasil Penjumlahan : $hitungSum")
    println("Hasil pengurangan : $hitungSub ")
}



    // primary constructor
    //val rumahC = RumahDua(100,80,100,"Sekar")
    //rumahC.luasTanah = 1500

    //secondary constructor
    val rumah0 = RumahTiga(100, 80, "Rogo")
    val rumahE = RumahTiga(180, "Kuning")

    fun contohPrimaryConst(){

        val rumahC = RumahDua(100, 80, 100, "Sekar")
        rumahC.luasTanah = 150
    }

    fun contohSecondConst() {

        //secondary constructor
        val rumah0 = RumahTiga(100, 80, "Rogo")
        val rumahE = RumahTiga(150, "Kuning")
    }

        fun contohLambFun(){
            // lambda expression/anonymus func
            val ucapanUltah = {name : String -> "Happy Birthdat $name"}
            val ucapan1 = ucapanUltah("Heru")
            println(ucapan1)
        }

        fun higherOrderFun() {
            // HOF : function yang ada didalam parameter function
        }

            fun calculated (a : Int, b : Int, operation: (Int,Int) -> Int):Int{
                return operation(a,b)
            }




