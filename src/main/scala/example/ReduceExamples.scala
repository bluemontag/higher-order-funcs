package example

object ReduceExamples extends App {


  val res: String = List("Luis", "Adrián", "Ignacio").reduce((res, elem) => res + ", " + elem)

  println(res)
}
