//This class contains methods for performing AI-ML concept.

package functionalConcept

object spiltList {

  def split[T](list: List[T], n: Int): (List[T], List[T]) = list.splitAt(n)

  def split_take_drop[T](list: List[T], n: Int): (List[T], List[T]) = (list.take(n), list.drop(n))


  def main(args:Array[String]): Unit = {

    val num1 = 3
    val result = split(List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"),num1)
    print(result)
  }

}
