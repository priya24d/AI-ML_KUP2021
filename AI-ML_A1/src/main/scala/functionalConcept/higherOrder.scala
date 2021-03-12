//This class contains methods for performing AI-ML concept.

package functionalConcept

import scala.io.StdIn.{readInt, readLine}

class higherOrder {

  def product(x: Int): Int => Int = (y: Int) => x * y
}

  object ProductInHigherOrderFunction_Impl {

    def main(args: Array[String]): Unit = {

      val higherorder = new higherOrder
      var continue = "Y"
      while (continue == "Y") {
        try {
          print("\nEnter two value: ")
          val input1 = readInt()
          val input2 = readInt()

          val tripler = higherorder.product(input1)
          print("Result: " + tripler(input2))
        }
        catch {
          case _: NumberFormatException => print("Enter valid inputs.")
        }
        print("\nDo you want to continue (Y or N): ")
        continue = readLine()
      }
    }
}
