package example

object TakingFuncsAsParams extends App {

  def mapList[B](list: List[Int], f: Int => B): List[B] = list match {
    case Nil => Nil
    case x :: xs => f(x) :: mapList(xs, f)
  }

  def doubleSalary(x: Int): Int = x * 2

  val salaries = List(20000, 70000, 40000)
  val newSalaries = mapList(salaries, doubleSalary)

  println(newSalaries)  // List(40000, 140000, 80000)
}
