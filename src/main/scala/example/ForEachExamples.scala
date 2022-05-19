package example

object ForEachExamples extends App {




  List("Hello", "World", "of", "FP").foreach { elem =>
      print(s" Elem: $elem")
  }
}
