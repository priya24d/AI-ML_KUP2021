//This class contains methods for performing AI-ML concept.

package tailRecursive

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

  class slicingListImplTest extends AnyFunSpec with Matchers {

    /* Below are the test cases where we are executing the test cases for slicing list method
  * to check if method is giving valid results or not.
  */

    describe("P18 Spec") {
      it("should return list between two indexes") {
        val result = slicingList.slice(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3, 7)
        result should have length 5
        result should be(List("c", "d", "e", "f", "g"))
      }
    }

    describe("P18 Spec recursion") {
      it("should return list between two indexes") {
        val result = slicingList.sliceR(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3, 7)
        result should have length 5
        result should be(List("c", "d", "e", "f", "g"))
      }
    }

  }


