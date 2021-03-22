
/* Course: 2020/2021 C2 Object Oriented Programming with Java
 * Student Name: Leon Kirby
 * Student Number: 20215594
 * Question: c2a1q1_2020
 */
import java.util.Scanner;// Import scanner

public class c2a1q1_2020_LeonKirby {

	public static void main(String[] args) {

		boolean check = true;// Boolean to control Do\While loop

		int answer = 0;// Initialize Integer for the Answer.

		String number;

		Scanner scan = new Scanner(System.in);// Open the Scanner

		do { // do while loop to check for valid entry

			System.out.print("Enter an integer between 1,000 and 999,999: ");

			number = scan.nextLine();// Get number from user in form of a string.

			try// Block to parse input to a integer and catch error if non integer is entered.
			{
				if (!number.contains(",")) {/* check input contains a comma */

					System.out.println("Invalid input try again.");

					check = false;

					continue;

				} else
					answer = Integer.parseInt(number.replace(",", ""));// Remove commas and parse string to an Integer

				check = true;// Set to true to exit loop.

				scan.close();// Close the Scanner.
			}

			catch (NumberFormatException e)// Catch error if non integer is entered.
			{
				System.out.println("Invalid input try again.");

				check = false;// Set check to false to re-run loop.
			}

		} while (!check);

		System.out.println("The number entered (without a comma) is: " + answer);// Print out result
	}

}
