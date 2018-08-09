package dussoye.shannon.scala_tutorial

object ScalaTut2_List {
	def main(args: Array[String]) {

    // For loop extended
	var i = 0
	var randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for (i <- 0 until randLetters.length){
    	println(randLetters(i))
    }

    //List in Scala
    var aList = List(1,2,3,4,5)
    for(i <- aList) {
      println("List Items "+i)
    }

	// Loop with Condition
	var evenList = for { i <- 1 to 20
		if (i % 2) == 0
		} yield i

	for(i<- evenList){
		println(i)
	}

	// nested Loop
	for(i <- 1 to 5; j <- 6 to 10){
		println("i: "+i)
		println("j: "+j)
	}
  }
}
