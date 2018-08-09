package dussoye.shannon.scala_tutorial

import scala.collection.mutable.ArrayBuffer

object ScalaTut8 {
	def main(args: Array[String]) {

		// Create an array of Int of size 20
		val favNums = new Array[Int](20)
		// Create a string array
		val friends = Array("S","D")
		// Change value of first element
		friends(0) = "SS"
		//Print
		println("best friends:" + friends(0))


		// Arraybuffer
		val friends2 = ArrayBuffer[String]()
		// inser at position 0
		friends2.insert(0,"phil")
		// add to array
		friends2 += "mark"
		// append array
		friends2 ++= Array("Susy","Paul")
		// Insert from starting position
		friends2.insert(1,"Mike","Sally","Sam", "Mary", "Sue")
		//remove element 1,2
		friends2.remove(1,2)

		var friend : String = ""
		for(friend <- friends2)
			println(friend)

		// Loop for favnums
		for(j <- 0 to (favNums.length -1 )){
			favNums(j) = j
			println(favNums(j))
		}

		// Multiply number by 2
		val favNumTimes2 = for (num <- favNums) yield 2 * num
		favNumTimes2.foreach(println)


		// Only print numbers divisible by 4
		var favNumDiv4 = for(num <- favNums if num % 4 ==0) yield num
		favNumDiv4.foreach(println)


		// Create a milti dimensional array
		var multTable = Array.ofDim[Int](10,10)

		// Loop through to add values
		// create I*j
		for(i <- 0 to 9){
			for(j <- 0 to 9){
				multTable(i)(j)=i*j
			}
		}
		// Loop to print "tables"
		for(i <- 0 to 9){
			for(j <- 0 to 9){
				printf("%d : %d = %d\n", i , j , multTable(i)(j))
			}
		}

		// Operations on Arrays
		println("Sum: "+ favNums.sum)
		println("Min: "+ favNums.min)
		println("Max: "+ favNums.max)

		// Sorting Arrays
		val sortedNums = favNums.sortWith(_>_)
		println(sortedNums.deep.mkString(", "))
	}
}
