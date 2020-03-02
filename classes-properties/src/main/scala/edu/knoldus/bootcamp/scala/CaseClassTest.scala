package edu.knoldus.bootcamp.scala

object CaseClassTest extends App {
  val a = CaseClassPerson()

  // corresponds to apply()
  val b = CaseClassPerson("Pam")

  // corresponds to apply(name: String)
  val c = CaseClassPerson("William Shatner", 82)

  println(a)
  println(b)
  println(c)

  // verify the setter methods work
  a.name = "Leonard Nimoy"
  a.age = 82
  println(a)
}
