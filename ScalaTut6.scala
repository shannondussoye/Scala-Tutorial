object ScalaTut6 {
	def main(args: Array[String]) {
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