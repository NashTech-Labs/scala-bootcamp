def ~=(x: Double, y: Double, precision: Double) = {
  if ((x - y).abs < precision) true else false
}

val a = 0.1
val b = 0.1
val c = a + b
val d = 0.2
c == d

val e = d + b
val f = 0.3
e == f

~=(e, f, 0.0001)