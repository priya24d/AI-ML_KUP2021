//This class contains methods for performing selection sorting.

package tailRecursive
import org.scalatest.flatspec.AnyFlatSpec

class printValueImplTest extends AnyFlatSpec {

  /* Below are the test cases where we are executing the test cases for printing value method
  * to check if method is giving valid results or not.
  */

  val inputnum1 = 25
  val inputnum2 = 30
  val inputnum3 = 15
  val inputnum4 = 20

  "Print value" should "be valid" in {
    val actualResult = printValue.printNum(inputnum1,inputnum2)
    val expectedResult = List(inputnum1,inputnum3,inputnum4,inputnum2)
    assert(actualResult === expectedResult)
  }
  "Print value" should "be valid if input1 < input2 the output will be empty List" in {
    val actualResult = printValue.printNum(inputnum2,inputnum1)
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  "Print value" should "be invalid" in {
    val actualResult = printValue.printNum(inputnum1,inputnum2)
    val expectedResult = List(inputnum1,inputnum2,inputnum4,inputnum2)
    assert(actualResult != expectedResult)
  }

}
