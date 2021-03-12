//This class contains methods for performing AI-ML concept.

package functionalConcept

object dupliElementlist {

  def duplicateTimes[T](list: List[T], times: Int): List[T] = list.flatMap(x => List.fill(times)(x))

  def duplicateTimes_recursion[T](list: List[T], times: Int): List[T] = list match {
    case x :: xs => List.fill(times)(x) ++ duplicateTimes_recursion(xs, times)
    case Nil => Nil
  }


  def main(args:Array[String]) {
    val result = duplicateTimes_recursion(List("a", "b", "c", "c", "d"), 3)
    print(result)
  }

}
