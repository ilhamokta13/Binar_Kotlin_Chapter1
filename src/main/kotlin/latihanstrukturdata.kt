import javax.management.openmbean.ArrayType

fun main(){
    //1
    var nama : String = "John Doe"
    println(nama)

    //2
    var umur : Int = 25
    println(umur)

    //3
    val gaji : Double = 5000.0
    println(gaji)

    //4
    val status : Boolean = true
    println(status)

    //5
    val nilai : Float = 7.5f
    println(nilai)

    //6
    val angka1 : Long = 123456789L
    println(angka1)

    //7
    val angka2 : Short = 100
    println(angka2)

    //8
    val huruf : Char = 'A'
    println(huruf)

    //9
    var nilaiString : String = "10"
    println(nilaiString)

    //10
    val angka3 : Byte = 25
    println(angka3)

    //11
    val angka = intArrayOf(1,2,3,4,5)
    for (i in angka.indices){
        println(angka[i])
    }

    //12
    val huruf1 = charArrayOf('a', 'b', 'c', 'd', 'e')
    for (i in huruf1.indices) {
        println(huruf1[i])
    }

    //13
    val nilai1 = doubleArrayOf(3.5, 4.0, 2.5, 3.0)
    for (i in nilai1.indices) {
        println(nilai1[i])
    }

    //14
    val namastudent = Array (4){""}
    namastudent[0] = "John"
    namastudent[1] = "Doe"
    namastudent[2] = "Jane"
    namastudent[3] = "Doe"
    println(namastudent.contentToString())

    //15
    val bulan = Array (12){""}
    bulan[0] = "Januari"
    bulan[1] = "Februari"
    bulan[2] = "Maret"
    bulan[3] = "April"
    bulan[4] = "Mei"
    bulan[5] = "Juni"
    bulan[6] = "Juli"
    bulan[7] = "Agustus"
    bulan[8] = "September"
    bulan[9] = "Oktober"
    bulan[10] = "November"
    bulan[11] = "Desember"
    println(bulan.contentToString())

    //16
    val nilai3 = FloatArray(3)
    nilai3[0]=2.5f
    nilai3[1]=3.0f
    nilai3[2]=2.0f
    for (i in nilai3.indices) {
        println(nilai3[i])
    }


    //17
    val angka4 = listOf<Int>(1,2,3,4,5)
    println(angka4)

    //18
    val huruf5 = listOf<Char>('a', 'b', 'c', 'd', 'e')
    println(huruf5)

    //19
    val angka5 = listOf<Double>(3.5, 4.0, 2.5, 3.0)
    println(angka5)

    //20
    val huruf6 = listOf<String>("John", "Doe", "Jane", "Doe")
    println(huruf6)

    //21
    val bulan1 = listOf<String>("Januari", "Februari", "Maret", "April", "Mei",
        "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember")
    println(bulan1)

    //22
    val nilaiFloat = listOf<Float>(2.5f, 3.0f, 2.0f)
    println(nilaiFloat)

    //23
    val angka6 = mutableListOf(1, 2, 3, 4, 5)
    angka6[4]=10
    println(angka6)

    //24
    val huruf7 = mutableListOf('a', 'b', 'c', 'd', 'e')
    huruf7[4]='f'
    println(huruf7)

    //25
    val nilai2 = mutableListOf(3.5, 4.0, 2.5, 3.0)
    nilai2.add(2.0)
    println(nilai2)

    //26
    val nama2 = mutableListOf("John", "Doe", "Jane", "Doe")
    nama2.remove("Doe")
    println(nama2)

    //27
    val bulanbaru = bulan.toMutableList()
    bulanbaru.add("Januari")
    println(bulanbaru)
}




