//This class contains methods for performing AI-ML concept.

package tailRecursive

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object printValue {

  def printNum(from: Int, to: Int) : List[Int] = {
    @tailrec
    def fives(currentValue: Int, maxValue: Int, result: List[Int]): List[Int] = {
      if (currentValue <= maxValue) {
        fives(currentValue + 5, maxValue, result :+ currentValue)
      }
      else{
        result
      }
    }
    fives(from, to, Nil)
  }

  def main(args:Array[String])
  {
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the start value and end value(5-50):  \n")
        val from: Int = readInt()
        if (from >= 5 && from <= 50) {
          val to: Int = readInt()

          if (to >= 5 && to <= 50) {
            print("Result is : ")
            printNum(from,to).foreach(print)
          }
          else {
            print("Enter values in 5-50 range only.")
          }
        }
        else {
          print("Enter values in 5-50 range only.")
        }
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }

}

