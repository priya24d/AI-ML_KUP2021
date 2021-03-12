//This class contains methods for performing AI-ML concept.

package tailRecursive

import scala.annotation.tailrec

object slicingList {

  def slice[T](list: List[T], start: Int, end: Int): List[T] = list.slice(start - 1, end)

  def sliceR[T](list: List[T], start: Int, end: Int): List[T] = {
    @tailrec
    def slice(list: List[T], cur: Int, acc: List[T]): List[T] = list match {
      case x :: xs if cur >= start - 1 && cur < end => slice(xs, cur + 1, acc :+ x)
      case x :: xs => slice(xs, cur + 1, acc)
      case _ => acc
    }
    slice(list, 0, List())
  }

}

