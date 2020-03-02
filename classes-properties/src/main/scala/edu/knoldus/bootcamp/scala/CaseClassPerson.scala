package edu.knoldus.bootcamp.scala

// the case class
case class CaseClassPerson (var name: String, var age: Int)

// the companion object
object CaseClassPerson {
  def apply() = new CaseClassPerson("<no name>", 0)
  def apply(name: String) = new CaseClassPerson(name, 0)
}
