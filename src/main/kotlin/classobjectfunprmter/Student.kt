package classobjectfunprmter

//function yang kita tambahkan ke suatu class
class Student (name : String, var age : Int, nim:String)

//fun isAdult(age : Int):Boolean{
  //  return age >= 18
//}

fun dataNilai(){

}

fun profile(){

}

fun Student.isAdult():Boolean{
    return age >= 18
}

fun main(){

    val student1 = Student("Sekar",19, "264164" )
    println(student1.isAdult())
}