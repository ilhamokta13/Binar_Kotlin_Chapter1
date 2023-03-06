package latihanoop

//class Person(val name: String, val age: Int) {
//
//    fun introduce() {
//        println("Hi, my name is $name and I am $age years old.")
//    }
//
//}
//
//class Rectangle(val width: Double, val height: Double) {
//
//    fun getArea(): Double {
//        return width * height
//    }
//
//}
//
//class Animal(val name: String, val sound: String) {
//
//    fun makeSound() {
//        println("$name says $sound!")
//    }
//
//}
//
//open class person(val name: String, val age: Int) {
//
//}
//
//class Student(name: String, age: Int, val `class`: String, val score: Int) : person(name, age) {
//
//    fun getDetails(): String {
//        return "Name: $name, Age: $age, Class: $`class`, Score: $score"
//    }
//
//}

//class Car(val brand: String, val model: String, val year: Int) {
//    fun startEngine() {
//        println("The $brand $model ($year) engine has started!")
//    }
//}

//class BankAccount(var balance: Int) {
//
//    fun deposit(jumlah: Int) {
//        balance += jumlah
//    }
//
//    fun withdraw(jumlah: Int) {
//        if (balance >= jumlah) {
//            balance -= jumlah
//        } else {
//            println("Saldo tidak mencukupi")
//        }
//    }

//}
//open class animal(val name: String, val gender: String) {
//
//    open fun makeSound() {
//
//    }
//}
//class Cat(name: String, gender: String) : animal(name, gender) {
//
//    override fun makeSound() {
//        println("$name says Meow!")
//    }
//
//}
//
//class Dog(name: String, gender: String) : animal(name, gender) {
//
//    override fun makeSound() {
//        println("$name says Woof!")
//    }
//
//}
//
//open class Vehicle(val brand: String, val color: String) {
//
//    open fun drive() {}
//
//}
//
//class car(brand: String, color: String) : Vehicle(brand, color) {
//
//    override fun drive() {
//        println("Driving $brand")
//    }
//
//}
//
//class Motorcycle(brand: String, color: String) : Vehicle(brand, color) {
//
//    override fun drive() {
//        println("Driving $brand")
//    }
//
//}
//
//open class Shape(val length: Double, val width: Double) {
//    open fun getArea(): Double {
//        return length * width
//    }
//}
//
//class rectangle(length: Double, width: Double) : Shape(length, width)
//
//class square(length: Double) : Shape(length, length)


//class User(val username: String, password: String) {
//    private var password: String = password
//        set(value) {
//            field = value
//        }
//
//    fun login(username: String, password: String): Boolean {
//        return this.username == username && this.password == password
//    }
//}

class Person(val name: String, val age: Int, private val address: String) {

    fun getDetails(): String {
        return "Name: $name\nAge: $age\nAddress: $address"
    }
}



    fun main() {
        val person = Person("Ilham", 21, "Pekarungan")
        println(person.getDetails())

    }





