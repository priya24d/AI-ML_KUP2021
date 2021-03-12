//This class contains methods for performing AI-ML concept.

package functionalConcept

  import org.scalatest.flatspec.AnyFlatSpec

  class computeRaidusImplTest extends AnyFlatSpec {

    val input1 = "3"
    val input2 = "4"

    /* Below are the test cases where we are executing the test cases for computing raidus method
    * to check if method is giving valid results or not.
    */

    "Computation" should "be valid if raidus is passed as integer 3" in {
      val actualResult = computeRaidus.circleArea("3")
      val expectedResult = 28.274333882308138
      assert(actualResult === expectedResult)
    }

    "Computation" should "be valid if radius is passed as double 3.0" in {
      val actualResult = computeRaidus.circleArea("3.0")
      val expectedResult = 28.274333882308138
      assert(actualResult === expectedResult)
    }

    "Computation" should "be valid if radius is passed as string '0' " in {
      val actualResult = computeRaidus.circleArea("0")
      val expectedResult = 0
      assert(actualResult === expectedResult)
    }

    "Computation" should "be invalid" in {
      val actualResult = computeRaidus.circleArea("29")
      val expectedResult = 12
      assert(actualResult != expectedResult)
    }

}
