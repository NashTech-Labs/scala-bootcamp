package edu.knoldus.bootcamp.scala

class Foo {
  // set 'text' equal to the result of the block of code
  //val text = {
  lazy val text = {
    var lines = ""
    try {
      lines = io.Source.fromFile("/etc/passwd").getLines.mkString
    } catch {
      case e: Exception => lines = "Error happened"
    }

    lines
  }

  println(text)
}

object Test extends App {
  val f = new Foo
}
