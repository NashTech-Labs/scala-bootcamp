package edu.knoldus.bootcamp.scala

class CustomPerson(private var _name: String) {
  def name = _name    //accessor

  // mutator
  def name_=(aName: String) {
    _name = aName
  }
}

object TestCustomPerson extends App {
  val p = new CustomPerson("Himanshu Gupta")
  p.name = "Knolder"
  println(p.name)
}
