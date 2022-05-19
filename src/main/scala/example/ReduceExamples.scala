package example

object ReduceExamples extends App {


  val res: String = List("Luis", "Adrián", "Ignacio").reduce((res, elem) => res + ", " + elem)

  println(res)

//  val empty: List[String] = List()
//  empty.reduce((res, elem) => res + ", " + elem) // Exception in thread "main" java.lang.UnsupportedOperationException: empty.reduceLeft
}
