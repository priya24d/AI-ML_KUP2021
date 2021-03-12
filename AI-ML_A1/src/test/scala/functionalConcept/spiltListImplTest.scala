//This class contains methods for performing AI-ML concept.

package functionalConcept

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

  class spiltListImplTest extends AnyFunSpec with Matchers {

    /* Below are the test cases where we are executing the test cases for splitting list of elements method
  * to check if method is giving valid results or not.
  */

    describe("spiltList") {

      it("should split into two halves by length") {
        val (first, second) = spiltList.split(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3)
        first should have length 3
        first should be(List("a", "b", "c"))
        second should have length 7
        second should be(List("d", "e", "f", "g", "h", "i", "k"))
      }

      it("should split into two halves by length with size 0 and list size when n is 0") {
        val (first, second) = spiltList.split(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 0)
        first should have length 0
        first should be(List())
        second should have length 10
        second should be(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"))
      }
    }

    describe("P17 Spec take-drop") {

      it("should split into two halves by length") {
        val (first, second) = spiltList.split_take_drop(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3)
        first should have length 3
        first should be(List("a", "b", "c"))
        second should have length 7
        second should be(List("d", "e", "f", "g", "h", "i", "k"))
      }

      it("should split into two halves by length with size 0 and list size when n is 0") {
        val (first, second) = spiltList.split_take_drop(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 0)
        first should have length 0
        first should be(List())
        second should have length 10
        second should be(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"))
      }
    }

  }
