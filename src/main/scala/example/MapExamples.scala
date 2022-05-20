package example

object MapExamples extends App {

  val list: List[Int] = List(1, 2, 3, 4, 5)

  println(list.map(x => x % 2 == 1))

  // what is going to be printed here ???


  val list2: List[String] = List("Hola", "David")

  val flattMapped = list2.flatMap(elem => List(elem) )

  println(flattMapped) // and here?


  val forVal = for {
    elem <- list2
    char <- elem
  } yield char

  println(forVal)
}
