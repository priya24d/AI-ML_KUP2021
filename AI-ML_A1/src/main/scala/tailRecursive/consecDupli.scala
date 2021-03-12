//This class contains methods for performing AI-ML concept.

package tailRecursive

import scala.annotation.tailrec
import scala.collection.immutable.List
import scala.io.StdIn.{readInt, readLine}

object consecDupli {

  def removeDuplicate[Any](inputList : List[Any]) : List[Any] = {
    @tailrec
    def compress(inputListByUser: List[Any], currentList: List[Any]) : List[Any] = inputListByUser match {
      case Nil => currentList.reverse
      case topValueOfList :: listWithoutTopValue =>
        if (currentList.contains(topValueOfList)) {
          compress (listWithoutTopValue, currentList)
        } else {
          compress(listWithoutTopValue, topValueOfList :: currentList)
        }
    }
    compress(inputList, Nil)
  }

  def main(args: Array[String]): Unit = {

    print("Enter the total elements to be inserted in the List: ")
    val sizeOfList: Int = readInt()

    print(s"Enter $sizeOfList elements: \n")
    val inputList = List.fill(sizeOfList) {
      readLine()
    }

    print(s"Original List: $inputList ")
    print("\nList with no duplicate elements: " + removeDuplicate(inputList))

  }
}





