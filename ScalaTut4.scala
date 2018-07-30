//Handling I/O
import scala.io.StdIn.{readLine, readInt}

object ScalaTut4 {
	def main(args: Array[String]) {
		var numberGuess = 0
		do{
			print("Guess a number: ")
			// readLine to string then convert to Int
			numberGuess = readLine.toInt
		} while(numberGuess!=15)

		// using printf
		printf("You guessed the secret number %d\n",15)
	}
}