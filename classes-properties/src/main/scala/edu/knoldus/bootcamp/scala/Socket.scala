package edu.knoldus.bootcamp.scala

class Socket(val timeout: Int = 1000, val linger: Int = 2000) {
  override def toString = s"timeout: $timeout, linger: $linger"
}

object TestSocket extends App {
  println(new Socket(timeout=3000, linger=4000))
  println(new Socket(linger=4000, timeout=3000))
  println(new Socket(timeout=3000))
  println(new Socket(linger=4000))
}
