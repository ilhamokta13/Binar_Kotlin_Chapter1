package controlflow

fun main() {
    JumlahBilanganGanjil()
}

    fun bilanganbulat() {
        for (bulatrange in 1..10) {
            print(" ," + bulatrange)
        }
    }

fun bilangangenap(){
    for (angka in 0..20){
        if(angka%2==0)
            print(" , " + angka)
    }

}

fun bilanganterbalik(){
    for (terbalik in 10..1){
        print(" , " + terbalik)
    }
}

fun cetakhari(){
    var number : Int
    print(" Input angka : ")
    number = readLine()!!.toInt()
    val hasil = when (number) {
        1-> {
            "Senin"
        }

        2 -> {
            "Selasa"
        }

        3 -> {
            "Rabu"
        }

        4-> {
            "Kamis"
        }

        5 -> {
            "Jum'at"
        }

        6 -> {
            " Sabtu"
        }

        7 -> {
            "Minggu"
        }

        else -> {
            " Hari tidak valid"
        }
    }

    println(" Sekarang hari " + hasil)

}



fun hargadiskon(){
    val price: Double
    val discount: Double
    for (price in 0..100) {
        if (price > 100) {

        }

    }
}

fun penentuanbilangan() {
    var num: Int
//Input Angka
    print("Number : ")
    num = readLine()!!.toInt()
    val hasilNumb = when {
        num < 0 -> println("angka negatif")
        num > 0 -> println("angka positif")
        else -> println("angka 0")
    }
    println(hasilNumb)
}

fun jumlahbilanganganjil() {
    var oddSum =0
    for (ganjil in 1..100) {
        if (ganjil % 2 != 0) {
            oddSum = oddSum+ ganjil

        }
    }
    println("Jumlah bilangan ganjil dari 1 hingga 100 adalah "  +  oddSum)
}

fun tampilbilangangenap(){
    var k = 2
    while(k <= 20){
        println(k)
        k+=2
    }
}

fun tampilbilanganganjil(){
    var l =1
    do {
        println(l)
        l+=1
    }while (l <= 20)
}

fun getDiscount (price: Double, discount : Double) : Double {
    var result: Double;
    if (price > 100 && discount > 10){
        result = price - (price * (discount/100))
    }else{
        result = price
    }
    return result;
}


fun jumlahganjil() {
    var sum = 0
    var m = 1
    while (m <= 50) {
        if (m % 2 != 0) {
            sum += m
        }
        m++
    }
    println("Jumlah bilangan ganjil dari 1 hingga 50 adalah "  + sum)


}

fun jumlahBilanganGanjil(){
    var sum = 0
    for (i in 3..50) {
        if(i % 2 != 0){
            if (i == 25) {
                break
            }
            sum += i
        }
    }
    println("Jumlah bilangan ganjil antara 1 dan 25 adalah $sum")
}

fun karakter(){
    val karakter = 'A'..'Z'
    print(" , " + karakter)
}

fun CalculatorGrade(){
    val score : Int
    print("Input Nilai : ")
    score = readLine()!!.toInt()
    // mengecek nilai dari variabel score
    // untuk mendapatkan nilai dalam bentuk huruf
    if (score >= 90) {
        println("A")
    } else if (score < 80 && score >= 89) {
        println("B")
    } else if(score < 70 && score >= 79) {
        println("C")
    } else if(score < 60 && score >= 69 ) {
        println("D")
    } else {
        println("F")
    }
}

fun bilanganpositif(){
    val bilpositif : Int
    print(" Masukkan bilangan positif = ")
    bilpositif = readLine()!!.toInt()
    do {
        bilpositif==0
    }while (bilpositif <= 0)
}

fun JumlahBilanganGanjil() {
    var sum = 0
    var i = 1
    val ganjil = intArrayOf(5, 3, 7, 9, 6, 12)
    for (i in ganjil.indices) {
        if (i % 3 == 0) {
            sum +=i
        }
        break
    }

    println("Bilangan pertama dalam array yang habis dibagi 3 adalah  ")
}










