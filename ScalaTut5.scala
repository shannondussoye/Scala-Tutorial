object ScalaTut5 {
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
	}
}

// %c = characters, %d = decimal, %s = string