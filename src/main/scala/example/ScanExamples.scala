package example

object ScanExamples extends App {

  // def scan[B >: A](z: B)(op: (B, B) => B): List[B]
  // Computes a prefix scan of the elements of the collection.

  // def scanLeft[B](z: B)(op: (B, A) => B): List[B]
  // Produces a list containing cumulative results of applying the operator going left to right, including the initial value.

  // def scanRight[B](z: B)(op: (A, B) => B): List[B]
  // Produces a collection containing cumulative results of applying the operator going right to left.


  val res = List(1,2,3).scan(0)( (b1, b2) => b1 + b2)
  val res2 = List(1,2,3).scanLeft(0)( (b, a) => b + a)
  val res3 = List(1,2,3).scanRight(0)( (a, b) => a + b)

  println(res)
  println(res2)
  println(res3)
}
