package example

object FilterExamples extends App {

  // Filtering functions
  val list = List("Hello", "World", "of", "FP")

  val res = list.filter(elem => elem.toLowerCase().contains("f"))
  println(res) // What is going to be printed here?

  val res2 = list.filterNot(elem => elem.startsWith("Spain"))
  println(res2)

}
