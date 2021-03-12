package functionalConcept

import org.scalatest.flatspec.AnyFlatSpec

class higherFunctionImplTest extends AnyFlatSpec{

  /* Below are the test cases where we are executing the test cases for checking higher function method
  * to check if method is giving valid results or not.
  */


  "Maximum Number" should "be valid" in {
    val actualResult = higherFunction.highNumber((15,0,45),higherFunction.max)
    val expectedResult = 45
    assert(actualResult === expectedResult)
  }

  "Maximum Number" should "be invalid" in {
    val actualResult = higherFunction.highNumber((15,0,45),higherFunction.max)
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

}
