//This class contains methods for performing AI-ML concept.

package functionalConcept

object dupliElement {

  def duplicate[T](list: List[T]): List[T] = list.flatMap(e => List(e, e))

  def duplicate_recursion[T](list: List[T]): List[T] = list match {
    case x :: xs => x +: x +: duplicate_recursion(xs)
    case Nil => Nil
  }

  def main(args:Array[String]) {
    val result = duplicate(List("a", "b", "c", "c", "d"))
    print(result)
  }

}
