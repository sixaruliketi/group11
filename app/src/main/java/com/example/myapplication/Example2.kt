package com.example.myapplication

interface Shape {
    fun area() : Int
    fun perimeter()
}

open class Rectangle(var width : Int, var length : Int) : Shape {

    override fun area(): Int {
        return width * length
    }

    override fun perimeter() {
        println(2*(width+length))
    }
}
class Cube(width: Int, length: Int, var height: Int):
    Rectangle(width, length){

}

fun main(){
    var c1 = Cube(3,3,3)


}