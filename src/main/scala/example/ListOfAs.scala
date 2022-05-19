package example

abstract class ListOfAs[A] {

  def fold[A1 >: A](z: A1)(op: (A1, A1) => A1): A1
  //  Folds the elements of this list using the specified associative binary operator.

  def foldLeft[B](z: B)(op: (B, A) => B): B
  //  Applies a binary operator to a start value and all elements of this list, going left to right.

  def foldRight[B](z: B)(op: (A, B) => B): B
  //  Applies a binary operator to all elements of this list and a start value, going right to left.

  def reduce[B >: A](op: (B, B) => B): B
  // Reduces the elements of this list using the specified associative binary operator.

  def reduceLeft[B >: A](op: (B, A) => B): B
  // Applies a binary operator to all elements of this list, going left to right.

  def reduceLeftOption[B >: A](op: (B, A) => B): Option[B]
  // Optionally applies a binary operator to all elements of this list, going left to right.

  def reduceOption[B >: A](op: (B, B) => B): Option[B]
  // Reduces the elements of this list, if any, using the specified associative binary operator.

  def reduceRight[B >: A](op: (A, B) => B): B
  // Applies a binary operator to all elements of this list, going right to left.

  def reduceRightOption[B >: A](op: (A, B) => B): Option[B]
  // Optionally applies a binary operator to all elements of this list, going right to left.

  def foreach[U](f: (A) => U): Unit
  // Apply f to each element for its side effects Note: [U] parameter needed to help scalac's type inference.

  def filter(p: (A) => Boolean): List[A]
  // Selects all elements of this list which satisfy a predicate.

  def filterNot(p: (A) => Boolean): List[A]
  // Selects all elements of this list which do not satisfy a predicate.

  def dropWhile(p: (A) => Boolean): List[A]
  // Drops longest prefix of elements that satisfy a predicate.

  def forall(p: (A) => Boolean): Boolean
  // Tests whether a predicate holds for all elements of this list.

  def exists(p: (A) => Boolean): Boolean
  // Tests whether a predicate holds for at least one element of this list.

  def find(p: (A) => Boolean): Option[A]
  // Finds the first element of the list satisfying a predicate, if any.

  def findLast(p: (A) => Boolean): Option[A]
  // Finds the last element of the list satisfying a predicate, if any.

  def count(p: (A) => Boolean): Int
  // Counts the number of elements in the list which satisfy a predicate.

  def partition(p: (A) => Boolean): (List[A], List[A])
  // A pair of, first, all elements that satisfy predicate p and, second, all elements that do not.

  def partitionMap[A1, A2](f: (A) => Either[A1, A2]): (List[A1], List[A2])
  /* Applies a function f to each element of the list and returns a pair of lists:
     the first one made of those values returned by f that were wrapped in scala.util.Left,
     and the second one made of those wrapped in scala.util.Right.
   */

  def groupBy[K](f: (A) => K): Map[K, List[A]]
  // Partitions this list into a map of lists according to some discriminator function.

  def groupMap[K, B](key: (A) => K)(f: (A) => B): Map[K, List[B]]
  // Partitions this list into a map of lists according to a discriminator function key.
}