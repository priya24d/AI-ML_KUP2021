//This class contains methods for performing AI-ML concept.

package functionalConcept

class conditionFunc {

  def condition[A](x: A, p: A => Boolean, f: A => A): A = {
    if (p(x)) f(x) else x
  }

}
  object conditionMain{

    val conditionfunc = new conditionFunc
    def main(args:Array[String]){
      val result = conditionfunc.condition[String]("priya", _.length > 4, _.reverse)
      print(result)
    }
}
