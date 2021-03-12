//This class contains methods for performing AI-ML concept.

package functionalConcept
import org.scalatest.flatspec.AnyFlatSpec

class greaterAmountImplTest extends AnyFlatSpec {

  /* Below are the test cases where we are executing the test cases for checking greater amount method
  * to check if method is giving valid results or not.
  */

  val greateramount = new greaterAmount
  val input1:Int= 89
  val input2:Double= 12.0
  val input3:Double = 56.09
  val input4:Double= -87.05

  "Comparing zero" should "be valid if the value is of Integer Type" in {
    val actualResult = greateramount.compare(input1)
    val expectedResult = "greater"
    assert(actualResult === expectedResult)
  }

  "Comparing zero" should "be valid if the value is of Double Type" in {
    val actualResult = greateramount.compare(input2)
    val expectedResult = "greater"
    assert(actualResult === expectedResult)
  }

  "Comparing zero" should "be valid if the value is smaller in Double Type" in {
    val actualResult = greateramount.compare(input3)
    val expectedResult = "greater"
    assert(actualResult === expectedResult)
  }


  "Comparing zero" should "be valid if the value is of negative Type" in {
    val actualResult = greateramount.compare(input4)
    val expectedResult = "smaller"
    assert(actualResult === expectedResult)
  }


  "Comparing zero" should "be valid if the value is 0 " in {
    val actualResult = greateramount.compare(0)
    val expectedResult = "same"
    assert(actualResult === expectedResult)
  }

}
