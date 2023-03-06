package classobjectfunprmter

class RumahTiga {
    //atribut - properti
    var panjangRumah : Int = 100
    var lebarRumah : Int = 50
    var luasTanah = 100
    var namaPemilik : String = "Ilham"
    var warnaRumah : String = "Kuning"

    constructor(_panjangRumah : Int, _lebarRumah : Int, _namaPemilik : String){
        this.panjangRumah = _panjangRumah
        this.lebarRumah =_lebarRumah
        this.namaPemilik=_namaPemilik
    }

    constructor(_luasTanah : Int, _warnaRumah : String){
        this.warnaRumah = _warnaRumah
        this.luasTanah = _luasTanah
    }

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