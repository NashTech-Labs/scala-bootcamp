package edu.knoldus.bootcamp.scala

object PreparePizza  extends App {

  val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  val p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
  val p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
  val p4 = new Pizza

  println(p1)
  println(p2)
  println(p3)
  println(p4)
}
