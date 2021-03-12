//This class contains methods for performing AI-ML concept.

package functionalConcept

object computeRaidus {

  def circleArea(r: String): Double = {
          if (r.isEmpty) {
            0
          } else {
            math.pow(r.toDouble, 2) * math.Pi
          }
     }

  def main(args:Array[String]) {
    val result = circleArea("3")
    print(result)
  }

}
