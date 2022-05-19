package example

object Currying extends App {

  def successorWithParam(x: Int): Int = x + 1

  def successorLambda: Int => Int = x => x + 1

  val two1 = successorWithParam(1)
  val two2 = successorLambda(1)

  def functionName(param1: Int, param2: String): String = {
    "Param1=" + param1.toString + ", Param2=" + param2
  }

  def sumXAndY(x: Int, y: Int): Int = x + y

  def curriedSum(x: Int)(y: Int): Int = x + y

  def sumX: Int => Int => Int = x => y => x + y

  def successorVersion2: Int => Int = sumX(1)

  def successorVersion3: Int => Int = curriedSum(1)

  // Tests

  val list: List[Int] = List(1, 2, 3, 4)

  println(list.map(successorLambda))

  println(list.map(x => x + 1))

  println(list.map(sumX(1)))

  println(list.map(sumX(1)))
}
