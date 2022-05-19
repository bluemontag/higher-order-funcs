package example

object GroupByExamples extends App {


  val res = List("Hello", "World", "of", "FP").groupBy(elem => elem.length)

  println(res) // HashMap(5 -> List(Hello, World), 2 -> List(of, FP))
}
