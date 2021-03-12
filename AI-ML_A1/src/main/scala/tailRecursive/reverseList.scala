//This class contains methods for performing AI-ML concept.

package tailRecursive

import scala.annotation.tailrec

object reverseList {

  def reverse[T](list: List[T]): List[T] = list.reverse

  def reverseRecursive[T](list: List[T]): List[T] = {
    @tailrec
    def tail(src: List[T], dest: List[T]): List[T] = src match {
      case Nil => dest
      case x :: xs => tail(xs, x +: dest)
    }
    tail(list, List())
  }

  def main(args:Array[String]): Unit = {
    val result = reverseList.reverseRecursive(List(1, 1, 2, 3, 5, 8))
    print(result)
  }

}