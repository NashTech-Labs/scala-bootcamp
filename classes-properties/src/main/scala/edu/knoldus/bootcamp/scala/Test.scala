package edu.knoldus.bootcamp.scala

class PersonEq {
  var name = ""
  override def toString = s"name = $name"
}

object Test extends App {
  val p = new PersonEq

  // the 'normal' mutator approach
  p.name = "Ron Artest"
  println(p)

  // the 'hidden' mutator method
  p.name_$eq("Metta World Peace")
  println(p)
}
