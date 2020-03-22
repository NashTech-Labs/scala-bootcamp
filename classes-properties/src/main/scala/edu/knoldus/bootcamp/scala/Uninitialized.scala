package edu.knoldus.bootcamp.scala

case class PersonUninitialized(var username: String, var password: String) {
  var age = 0
  var firstName = ""
  var lastName = ""
  var address: Option[Address] = None: Option[Address]
}

case class Address(city: String, state: String, zip: String)

object TestPersonUninitialized extends App {
  val p = PersonUninitialized("alvinalexander", "secret")
  p.address = Some(Address("Talkeetna", "AK", "99676"))
  p.address.foreach { a =>
    println(a.city)
    println(a.state)
    println(a.zip)
  }
}
