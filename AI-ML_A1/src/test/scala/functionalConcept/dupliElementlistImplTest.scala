//This class contains methods for performing AI-ML concept.

package functionalConcept

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

  class dupliElementlistImplTest extends AnyFunSpec with Matchers {

    /* Below are the test cases where we are executing the test cases for duplicate list of elements method
  * to check if method is giving valid results or not.
  */

    describe("dupliElementlist Spec") {
      it("should duplicate N times elements of a list") {
        val duplicates: List[String] = dupliElementlist.duplicateTimes(List("a", "b", "c"), 3)
        duplicates should have length 9
        duplicates should equal(List("a", "a", "a", "b", "b", "b", "c", "c", "c"))
      }
    }

    describe("dupliElementlist Spec recursion") {
      it("should duplicate N times elements of a list") {
        val duplicates: List[String] = dupliElementlist.duplicateTimes_recursion(List("a", "b", "c"), 3)
        duplicates should have length 9
        duplicates should equal(List("a", "a", "a", "b", "b", "b", "c", "c", "c"))
      }
    }

  }
