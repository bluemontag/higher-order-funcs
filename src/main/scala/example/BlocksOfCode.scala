package example

object BlocksOfCode extends App {

  def doubleApplication(x: Int)(y: Int)(f: Int => Int): (Int, Int) = (f(x), f(y))

  val fancy = doubleApplication(1)(2) { num =>
    val res = num * 4
    println(s"Calculating result of f($num) = $res")
    res
  }

  def f1: Int => Int = num => num * 4

  val pretty1 = doubleApplication(1)(2)(f1)

  val pretty2 = doubleApplication(1)(2)(num => num * 4)

  println(fancy)

}
