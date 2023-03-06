package classobjectfunprmter
fun main() {
    val inputpenjualan = Inputpenjualan()
    var NamaPembeli: String = " "
    var JudulBuku: String = " "
    var Jumlah: Int = 0
    var Harga: Int = 0
    var UangBayar: Int = 0
    var Kembali: Int = 0
    var Total: Int = 0
    var Totaldiskon: Int = 0
    var diskon: Int = 50000

    println("........................................")
    println("INPUT TRANSAKSI PENJUALAN TOKO BUKU AND5")
    println("........................................")
    print(" Nama Pembeli : ")
    NamaPembeli = readLine().toString()
    print(" Judul Buku : ")
    JudulBuku = readLine().toString()

    print(" Jumlah : ")
    Jumlah = readLine()!!.toInt()

    print(" Harga : ")
    Harga = readLine()!!.toInt()

    print(" Uang Bayar : ")
    UangBayar = readLine()!!.toInt()

    Total = Jumlah * Harga
    if (UangBayar > Total) {

            println("------------------------------")
            println("------------------------------")
            println("STRUK PEMBELIAN BUKU TOKO AND5")
            println("..............................")

            println(" Nama Pembeli      :  ${NamaPembeli.toUpperCase()}")
            println(" Buku yang Dibeli  :  ${JudulBuku}")
            println(" Jumlah            :  ${Jumlah}")


        if (Total > 300000) {
            Totaldiskon = Total - diskon
            //println(" Harga Mula : ${Total}")
            // println( " Diskon : ${diskon}")
            println(" Harga diskon      : Rp    ${Totaldiskon}")
        } else {
            println(" Total             : Rp    ${Total}")
        }

        if (Total > 300000) {
            println(" Bayar             : Rp   ${UangBayar}")
            Kembali = UangBayar - Totaldiskon
            println(" Kembali           : Rp   ${Kembali}")
        } else {
            println(" Bayar             : Rp   ${UangBayar}")
            Kembali = UangBayar - Total
            println(" Kembali           : Rp   ${Kembali}")
        }

        if (Total in 150000..200000) {
            println("  Bonus            :  1 buah pena kecil ")
        } else if (Total in 200000..300000) {
            println("   Bonus           :  1 buah buku catatan")
        } else if (Total < 150000) {
            println(" Bonus : 0")

        }
    } else {
        println(" Maaf uangmu kurang")
    }
        println("----------  TERIMA KASIH-------------------------")
        println("           TOKO BUKU AND5")
        println("-------------------------------------------")
        println("-------------------------------------------")
}


//    if(Total > 300000){
//        Totaldiskon = Total - diskon
//        println(" Harga Mula : ${Total}")
//        println( " Diskon : ${diskon}")
//        println( " Harga diskon : ${Totaldiskon}")
//    }else{
//        println(" Total        :  ${Total}")
//    }
//
//
//    if(Total>300000){
//        println(" Bayar        :  ${UangBayar}")
//        Kembali = UangBayar - Totaldiskon
//        println(" Kembali      :  ${Kembali}")
//    }else{
//        println(" Bayar        :  ${UangBayar}")
//        Kembali = UangBayar - Total
//        println(" Kembali      :  ${Kembali}")
//    }
//
//   if ( Total in 150000..200000){
//       println( "Bonus : 1 buah pena kecil ")
//    } else if(Total in 200000..300000) {
//       println(" Bonus : 1 buah buku catatan")
//   } else if(Total < 150000){
//       println(" Bonus : 0")
//
//   }
//



