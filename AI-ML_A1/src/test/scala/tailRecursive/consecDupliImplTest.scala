//This class contains methods for performing AI-ML concept.

package tailRecursive

import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers

class consecDupliImplTest extends AnyFunSpec with Matchers {

  /* Below are the test cases where we are executing the test cases for consecutive element finding method
  * to check if method is giving valid results or not.
  */


  describe("Consecutive list") {

    it("should remove consecutive duplicates in a list") {
      val consecutiveList: List[String] = consecDupli.removeDuplicate(List("a", "a", "a", "a", "b", "c", "c", "d", "e", "e", "e", "e"))
      consecutiveList should have size 5
      consecutiveList should be(List("a", "b", "c", "d", "e"))
    }

    it("should not remove non consecutive duplicates in a list") {
      val consecutiveList: List[String] = consecDupli.removeDuplicate(List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e"))
      consecutiveList should have size 6
      consecutiveList should be(List("a", "b", "c", "a", "d", "e"))
    }
  }

}


