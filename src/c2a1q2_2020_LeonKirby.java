
/* Course: 2020/2021 C2 Object Oriented Programming with Java
 * Student Name: Leon Kirby
 * Student Number: 20215594
 * Question: c2a1q2_2020
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class c2a1q2_2020_LeonKirby {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Initialize variables
		int toss;
		int guess = 0;
		int correctGuess = 0;
		int round;

		Random dice = new Random();// Initialize random


		Scanner scan = new Scanner(System.in);// Initialize Scanner

		for (round = 1; round <= 5;) { // loop for 5 throws of the dice

			toss = dice.nextInt(6) + 1; // Get random number from 1-6

			do { // do while loop to check for valid entry

				System.out.print("Guess the next dice throw (1-6): ");

				try {
					guess = scan.nextInt();// get input from user

					if (guess <= 0 || guess > 6) {// check for guess between 1 and 6

						System.out.println("Number must be between 1 and 6 inclusive, please try again");
						break;
					}
					if (guess == toss) {// check guess against dice toss

						System.out.println("Congratulations, you guessed right!");

						correctGuess++; // increase variable when correct guess is obtained.

					} else {

						System.out.println("Hard luck, last throw was " + toss);

					}
					round++;// Increase round counter.

				}

				catch (InputMismatchException a) {// catch error when non integer is entered

					System.out.println("Number must be an integer, please try again.");

					scan.next();// get another guess form user.

				}
			} while (round < 5);// end of do/while loop

		}
		scan.close();// close scanner

		System.out.println("You got " + correctGuess + " right out of 5");// print result

	}

}
