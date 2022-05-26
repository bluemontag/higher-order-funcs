package example

object FoldExamples extends App {

  // def fold[A1 >: A](z: A1)(op: (A1, A1) => A1): A1
  //  Folds the elements of this list using the specified associative binary operator.

  // def foldLeft[B](z: B)(op: (B, A) => B): B
  //  Applies a binary operator to a start value and all elements of this list, going left to right.

  // def foldRight[B](z: B)(op: (A, B) => B): B
  //  Applies a binary operator to all elements of this list and a start value, going right to left.


  val numbers: List[String] = List("123", "342", "1000")

  val + = (acc: Int, elem: String) => acc + elem.length
//  val numbers2: Int = numbers.foldLeft(0)( + )


  // List("123", "342", "1000").foldLeft(0)(+) => ((0 + 3) + 3) + 4
  // List("123", "342", "1000").foldRight(0)(+) => 0 + (3 + (3 + 4))

  val numbers3: Int = numbers.foldLeft(0)( (acc, elem) => acc + elem.toInt)

//  println(numbers3)

  val powers = List(2,3,4)
  lazy val powersSum1 = powers.foldLeft(0)( (acc, elem) => {
    val acc2 = acc + math.pow(2, elem).toInt
    println(s"Processing element $elem, 2^$elem = ${math.pow(2, elem)}")
    acc2
  })

  lazy val powersSum2 = powers.foldRight(0)( (elem, acc) => {
    val acc2 = acc + math.pow(2, elem).toInt
    println(s"Processing element $elem, 2^$elem = ${math.pow(2, elem)}")
    acc2
  })

  // Folding left:   ((0 + 2^2) + 2^3) + 2^4
  // Folding right:  2^2+ (2^3 + (2^4 + 0))

  println(List(2,3,4).fold(0)((a:Int, b:Int) => a + b))
}
