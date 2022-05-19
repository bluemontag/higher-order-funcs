package example

object PatternMatchingAndRecursion extends App {


  def sumOfElements(list: List[Int]): Int = list match {
    case Nil => 0
    case x :: xs => x + sumOfElements(xs)
  }

  def lengthOfList(list: List[Int]): Int = list match {
    case Nil => 0
    case _ :: xs => 1 + lengthOfList(xs)
  }

  def processList(list: List[Int], f: Int => Int): List[Int] = list match {
    case Nil => Nil
    case x :: xs => f(x) :: processList(xs, f)
  }

  val len = lengthOfList(List(2,2,3,4,3,2)) // len: 6
  val sum = sumOfElements(List(1,2,3,4,5)) // sum: 15

  println(s"Len: $len")
  println(s"Sum: $sum")

}
