package org.example


sealed class Shape{
    class Circle(val radius: Double): Shape()
    class Rectangle(val length: Int, val width: Int): Shape()
}


fun main(){

}