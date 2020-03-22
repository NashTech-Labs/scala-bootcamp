package edu.knoldus.bootcamp.scala

class PersonParameterOverloading (var name: String, var address: AddressParameterOverloading) {
  override def toString = if (address == null) name else s"$name @ $address"
}

class EmployeeParameterOverloading (name: String, address: AddressParameterOverloading, var age: Int)
  extends PersonParameterOverloading (name, address) {
  // rest of the class
}

case class AddressParameterOverloading (city: String, state: String)

object TestParameterOverloading extends App {
  val teresa = new EmployeeParameterOverloading("Teresa", AddressParameterOverloading("Louisville", "KY"), 25)
  println(teresa.name)
  println(teresa.address)
  println(teresa.age)
}
