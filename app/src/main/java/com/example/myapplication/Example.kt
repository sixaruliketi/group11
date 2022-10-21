package com.example.myapplication

class Person : Any() {

    var name : String = ""
    var age : Int = 0
    var height : Double = 0.0
    var hasCar : Boolean = false

    fun walk(){
        println("walk")
    }
    // person1.equals(person2)

    override fun equals(other: Any?): Boolean {
        if (other is Person){
            if (name == other.name && age == other.age){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "name : $name \nage : $age"
    }

}

fun main(){
    var person1 = Person()
    person1.name = "keth"
    person1.age = 23
    println(person1)

    var person2 = Person()
    person2.name = "keth"
    person2.age = 23

}
