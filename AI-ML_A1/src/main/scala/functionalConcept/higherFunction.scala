//This class contains methods for performing AI-ML concept.

package functionalConcept

object higherFunction {

  val max: (Int, Int) => Int = (num1: Int, num2: Int) => if (num1 > num2) num1 else num2

  def highNumber(num: (Int, Int, Int), compare: (Int, Int) => Int): Int = {
       compare(num._1, compare(num._2, num._3))
     }

  def main(args:Array[String]): Unit = {

    val inputnum1 = 7
    val inputnum2 = 10
    max(inputnum1, inputnum2)
    val result = highNumber( (45, 13, 34), max )
    print(result)
  }
}
