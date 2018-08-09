package dussoye.shannon.scala_tutorial

object ScalaTut1_Loops {
  def main(args: Array[String]) {

    // While Loop
    var i = 0
    while(i<=10) {
      println("while loop: " +i)
      i +=1
    }

    // Do Whole Loop
    var j=0
    do {
      println("do while loop: "+j)
      j += 1
    }  while (j <= 20)

    //for loop
    var k = 0
    for(k <- 1 to 10){
      println("For loop: "+k)
    }

  }
}
