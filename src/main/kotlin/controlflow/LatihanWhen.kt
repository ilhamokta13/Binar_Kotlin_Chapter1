package controlflow

fun main(){

    val angka : Int = 3
    val result = when(angka){
        1 -> "Satu"
        2 -> "Dua"
        3 -> "Tiga"
        else -> "Tidak ada"
    }

    println(" angka : $result")

    val bulan : Int = 3

    val hasilBulan = when(bulan){
        1 -> "Januari"
        2 -> "Februari"
        else -> "Tidak ada"
    }

    println(hasilBulan)

    //ngecek apakah angka itu positif atau negatif
    var numb : Int =3
    println("Program Mengecek Angka Ganjil atau Genap")
    //Input Angka
    print("Input Angka : ")
    numb = readLine()!!.toInt()
    val hasilNumb = when{
        numb < 0 -> println("angka negatif")
        numb > 0 -> println("angka positif")
        else -> println("angka 0")
    }
    println(hasilNumb)

    // Range
        val nilaiStudent : Int = 45
        val hasilNilai = when(nilaiStudent){
            in 90 until 100 -> 'A'
            in 79 until  89 -> 'B'
            else -> "Tidak ada"
        }

    val nilaiTurun = 90 downTo 80
    println(nilaiTurun)

    val nilaiNaik = 1 until 10
    println(nilaiNaik)


    val hari : Int = 3
    val hasilhari = when(hari){
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        else -> "Tidak ada"
    }

    //menampilkan bil genap antara 1-20 (while do)
    var i = 2
    while(i <= 20){
        print(i)
        i+=2
    }


}