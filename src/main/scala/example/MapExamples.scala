package example

object MapExamples extends App {

  val list: List[Int] = List(1, 2, 3, 4, 5)

  // def map[B](f: A => B): List[B]
//  println(list.map(x => x % 2 == 1))

  // what is going to be printed here ???


  val list2: List[String] = List("Hola", "David")


//  def flatMap[B](f: A => List[B]): List[B]
  val flattMapped = list2.map(elem => List(elem) ).flatten


  println(List(List(1,2,3), List(3,4,5)).flatten)

//  println(flattMapped) // and here?


  val forVal = for {
    elem <- list2
    char <- elem
  } yield char

//  println(forVal)

  val flatVal = list2.flatMap( elem =>
      elem.map( char =>
        char))

//  println(flatVal)
}
