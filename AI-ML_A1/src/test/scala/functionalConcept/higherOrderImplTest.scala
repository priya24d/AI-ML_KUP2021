package functionalConcept

import org.scalatest.flatspec.AnyFlatSpec

class higherOrderImplTest extends AnyFlatSpec {

  /* Below are the test cases where we are executing the test cases for checking higher order method
  * to check if method is giving valid results or not.
  */


  val input1:Int = 12
  val input2:Int = 6

  val higherorder = new higherOrder

  "Higher function" should "be valid" in {
    val intermediateResult = higherorder.product(input1)
    val actualResult = intermediateResult(input2)
    val expectedResult = 72
    assert(actualResult === expectedResult)
  }


  "Higher function" should "be invalid" in {
    val intermediateResult = higherorder.product(input1)
    val actualResult = intermediateResult(input2)
    val expectedResult = 12
    assert(actualResult != expectedResult)
  }
}
