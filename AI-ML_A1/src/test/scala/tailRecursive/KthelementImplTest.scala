//This class contains methods for performing AI-ML concept.

package tailRecursive

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import tailRecursive.Kthelement.KthElement

class KthelementImplTest extends AnyFlatSpec with Matchers{
  /* Below are the test cases where we are executing the test cases for finding Kth element of list method
  * to check if method is giving valid results or not.
  */

  val num1: Int = -10
  val num2 = 10
  val num3 = 3
  val num4 = 0

    behavior of "A List"
    it must "return 0 in List(0,1,2,3) as 0th element" in {
      KthElement(num4, List(0, 1, 2, 3)) mustBe 0
    }
    it must "return 3 in List(0,1,2,3) as 3rd element" in {
      KthElement(num3, List(0, 1, 2, 3)) mustBe 3
    }
    it must "return None in List(0,1,2,3) as 10th element" in {
      KthElement(num2, List(0, 1, 2, 3)) mustBe None
    }
    it must "throw an IllegalArgumentException for negative index in list" in {
      an[IllegalArgumentException] must be thrownBy KthElement(num1, List(0, 1, 2, 3))
    }

}
