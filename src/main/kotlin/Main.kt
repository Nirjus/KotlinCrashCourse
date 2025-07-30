package org.example

fun main(){
    println("wassp dude!")
}
data class Person(name: String, age: Int)
fun createPerson(){
    val person1 = Person(name= "Ashu", age= 85)
    println("name : ${person1.name}")
    println(person1.age)
}
