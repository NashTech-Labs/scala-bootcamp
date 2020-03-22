package edu.knoldus.bootcamp.scala

class Stock {
  // a private field can be seen by any Stock instance
  private var price: Double = _
  // a private[this] var is object-private, and can only be seen
  // by the current instance
  //private[this] var price: Double = _
  def setPrice(p: Double) { price = p }
  def isHigher(that: Stock): Boolean = this.price > that.price
}

object Driver extends App {
  val s1 = new Stock
  s1.setPrice(20)

  val s2 = new Stock
  s2.setPrice(100)

  println(s2.isHigher(s1))
}
