//This class contains methods for performing AI-ML concept.

package functionalConcept

import scala.io.StdIn.{readDouble, readLine}

class greaterAmount {

    def compare(amount: Double): String = {
      amount match {
        case amount if amount > 0 => "greater"
        case amount if amount < 0 => "smaller"
        case amount if amount == 0 => "same"
      }
    }
  }
object greaterMain{
  def main(args: Array[String]): Unit = {

    val greateramount = new greaterAmount

    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the amount you want to compare from zero: ")
        val amount: Double = readDouble()
        print("Result is : " + greateramount.compare(amount))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}

