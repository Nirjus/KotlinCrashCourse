package org.example

/*
* Inheritance
*
* Inheritance is a concepts that help to take property from
* parents to child
*
* */

open class Animal{
    fun eat(){
        println("Animal is eating")

    }
}
open class Reptile{

}

class Dog: Animal() {
    fun bark(){
        println("Dog is barking")
    }
}
fun main(){

    val dog = Dog()
    dog.eat()
    dog.bark()

}