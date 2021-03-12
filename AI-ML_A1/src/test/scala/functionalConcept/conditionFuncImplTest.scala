package functionalConcept

import org.scalatest.flatspec.AnyFlatSpec

class conditionFuncImplTest extends AnyFlatSpec{

  /* Below are the test cases where we are executing the test cases for checking condition function method
  * to check if method is giving valid results or not.
  */

  val conditionfunc = new conditionFunc

  "Condition function" should "be valid" in {
    val actualResult = conditionfunc.condition[String]("priya", _.length > 4, _.reverse)
    val expectedResult = "ayirp"
    assert(actualResult === expectedResult)
  }

  "Condition function" should "be valid if length of string is less than 4" in {
    val actualResult = conditionfunc.condition[String]("ya", _.length > 4, _.reverse)
    val expectedResult = "ay"
    assert(actualResult === expectedResult)
  }

  "Condition function" should "be invalid" in {
    val actualResult = conditionfunc.condition[String]("ya", _.length > 4, _.reverse)
    val expectedResult = "priya"
    assert(actualResult != expectedResult)
  }
}

