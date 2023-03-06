package controlflow

fun main(){
    isOdd()
    //hitungScore()
    //println(tambahNilai())
    //val a = hitung(12)
    //println(a)

    //hitungTambah(12, 34)
    //println("angka1 + angka2 : ${hitungTambah(12,34)}")
}

fun hitungScore() {
    println("Hitung Nilai Score Mahasiswa")
    println("Masukkan Score :")
    val inputscore: Int = readLine()!!.toInt()

    if (inputscore > 50) {
        println("lulus")
    } else if (inputscore <= 50) {
        println("tidak lulus")
    } else {
        println("Tidak ada nilai")
    }

    //nested if
    val nilai1 = 23
    val nilai2: Int = 45
    val nilai3: Int = 67
    if (nilai1 > nilai2) {
        val maxN = if (nilai1 > nilai3) {
            nilai1
        } else {
            nilai3
        }
    } else if (nilai2 > nilai3) {
        "nilai 2 lebih besar"
    } else {
        "tidak valid"
    }
}


    fun tambahNilai():Char {
        return 'A'
    }

fun hitung(angka : Int): Int{
    return angka
}

fun hitungTambah(angka1: Int,angka2 : Int ){
    val hasil = angka1 + angka2

}

fun isOdd(){

    val angka:Int

    println("Program Mengecek Angka Ganjil atau Genap")
    //Input Angka
    print("Input Angka : ")
    angka = readLine()!!.toInt()
    //Pengecekan Angka
    if(angka%2==0)
        println(message = true)
    else
        println(message = false)
}

fun getDiscount(){
    val price = Double
    val discount = Double
    print("input harga : ")

}



