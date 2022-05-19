package example

object FilterExamples extends App {


  val list = List("Hello", "World", "of", "FP")

  val res = list.filter(elem => elem.toLowerCase().contains("f"))

  println(res) // List("of", "FP")
}
