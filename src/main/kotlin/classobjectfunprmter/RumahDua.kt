package classobjectfunprmter

class RumahDua(var panjangRumah :Int = 120,
               var lebarRumah: Int,
               var luasTanah:Int,
               var namaPemilik:String) {

    // deklarasi function
    fun hidupkanLampu():String{
        return "Rumah bisa menghidupkan lampu"
    }

    fun naikTurunLift():String{
        return "Bisa naik turun "
    }

    fun tahanPanas():String{
        return "Rumahnya tahan panas"
    }
}