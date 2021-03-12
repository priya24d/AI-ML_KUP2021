//This class contains methods for performing AI-ML concept.

package tailRecursive

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object Kthelement {

  @tailrec
  def KthElement[A](indexToFind: Int, inputList: List[A]): A = (indexToFind, inputList) match {
    case (0, topValueOfList :: _ ) => topValueOfList
    case (indexToFind, _ :: listWithoutTopValue) => KthElement(indexToFind - 1, listWithoutTopValue)
    case (_, Nil) => throw new NoSuchElementException
  }

  def main(args:Array[String]) {
  print("Enter the total elements to be inserted in the List: ")
  val sizeOfList: Int = readInt()

  print(s"Enter $sizeOfList elements: \n")
  val inputList = List.fill(sizeOfList) {
  readLine()
}

  print(s"Original List: $inputList")
  print("\nEnter the index of Kth element: ")
  val indexToFind: Int = readInt()

  print(s"$indexToFind kth element: " + KthElement(indexToFind,inputList))
  }
}
