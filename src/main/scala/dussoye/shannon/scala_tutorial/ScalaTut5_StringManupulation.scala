package dussoye.shannon.scala_tutorial

object ScalaTut5_StringManupulation {
	def main(args: Array[String]) {
		val name = "Shannon"
		val age = 28
		val weight = 64
		println(s"Hello $name")
		println(f"I am ${age+1} and weigh $weight%.2f")

		// Justification/Padding
		printf("'%5d'\n",5)
		printf("'%-5d'\n",5)
		printf("'%05d'\n",5)
		// float
		printf("'%.5f'\n",3.14)
		// String
		printf("'%-5s'\n","hi")

		var randSent = "I saw a dragon fly by"
		println("3rd index: " + randSent(3))
		println("Length of string: "+randSent.length)
		println(randSent.concat("and explode"))

		// Check if strings are equal
		println("Are strings equal " + "I saw a dragon".equals(randSent))

		// Start Index of Word
		println("Dragons start at index: " + randSent.indexOf("dragon"))

		// Convert String into Array
		val randSentArray = randSent.toArray
		for (v <- randSentArray){
			println(v)
		}
	}
}
