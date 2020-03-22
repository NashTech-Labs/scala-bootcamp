package edu.knoldus.bootcamp.scala

abstract class Pet (name: String) {
  val greeting: String
  var age: Int
  def sayHello { println(greeting) }
  override def toString = s"I say $greeting, and I'm $age"
}

class Dog (name: String) extends Pet (name) {
  val greeting = "Woof"
  var age = 2
}

class Cat (name: String) extends Pet (name) {
  val greeting = "Meow"
  var age = 5
}

object AbstractFieldsDemo extends App {
  val dog = new Dog("Fido")
  val cat = new Cat("Morris")
  dog.sayHello
  cat.sayHello
  println(dog)
  println(cat)

  // verify that the age can be changed
  cat.age = 10
  println(cat)
}
