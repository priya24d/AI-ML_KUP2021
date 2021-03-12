//This class contains methods for performing selection sorting.

package tailRecursive

  import org.scalatest.funspec.AnyFunSpec
  import org.scalatest.matchers.should.Matchers


  class reverseListImplTest extends AnyFunSpec with Matchers {

    /* Below are the test cases where we are executing the test cases for Reverse method
  * to check if method is giving valid results or not.
  */

    describe("Reverse a list (built-in)") {
      it("should reverse a list") {
        reverseList.reverse(List(1, 2, 3, 4, 5)) should equal(List(5, 4, 3, 2, 1))
      }
    }

    describe("Reverse a list (recursive)") {
      it("should reverse a list") {
        reverseList.reverseRecursive(List(1, 2, 3, 4, 5)) should equal(List(5, 4, 3, 2, 1))
      }
    }

  }
