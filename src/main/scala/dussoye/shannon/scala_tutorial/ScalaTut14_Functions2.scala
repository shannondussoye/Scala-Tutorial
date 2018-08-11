package dussoye.shannon.scala_tutorial

object ScalaTut14_Functions2 {
  def main(args: Array[String]){

      def times3(num: Int) = num * 3
      def times4(num: Int) = num * 4
      def multIt(func : (Int) => Double, num : Int ) = {
        func(num)
    }
    printf("3 * 100 = %.1f)\n", multIt(times3, 100))
  }

}



