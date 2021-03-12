//This class contains methods for performing selection sorting.

package functionalConcept
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers


class dupliElementImplTest extends AnyFunSpec with Matchers {

  /* Below are the test cases where we are executing the test cases for duplicate element method
  * to check if method is giving valid results or not.
  */

  describe("P14 Spec") {
    it("should duplicate elements in a list") {
      val duplicateList: List[String] = dupliElement.duplicate(List("a", "b", "c", "d"))
      duplicateList should have length 8
      duplicateList should equal(List("a", "a", "b", "b", "c", "c", "d", "d"))
    }
  }

  describe("P14 Spec (recursion)") {
    it("should duplicate elements in a list") {
      val duplicateList: List[String] = dupliElement.duplicate_recursion(List("a", "b", "c", "d"))
      duplicateList should have length 8
      duplicateList should equal(List("a", "a", "b", "b", "c", "c", "d", "d"))
    }
  }

}
