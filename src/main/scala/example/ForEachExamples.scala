package example

object ForEachExamples extends App {




  List("Hello", "World", "of", "FP").foreach { elem =>
      println(s" Elem: $elem")
  }
}
