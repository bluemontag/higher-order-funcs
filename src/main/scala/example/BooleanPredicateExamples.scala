package example

object BooleanPredicateExamples extends App {
  // Boolean predicate functions

  val list = List("Hello", "World", "of", "FP")

  val bool = list.forall( elem => elem.length >= 2)
  val bool2 = list.exists( elem => elem.length == 5)
  val bool3 = list.find( elem => elem.length > 5)

  println(bool)
  println(bool2)
  println(bool3)
}
