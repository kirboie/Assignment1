
/* Course: 2020/2021 C2 Object Oriented Programming with Java
 * Student Name: Leon Kirby
 * Student Number: 20215594
 * Question: c2a1q4_2020
 */
import java.util.Scanner;// Import the scanner class

public class c2a1q4_2020_LeonKirby {

	public static void main(String[] args) {// Start of main method

		String passWord; // Initialize string for the password.

		boolean goodInput = true; // Initialize boolean to control do/while loop

		Scanner code = new Scanner(System.in);// Initialize the scanner

		// Give requirements for a valid password.

		System.out.println("1. A code must contain no spaces");

		System.out.println("2. A code must have between 5 and 10 characters (inclusive)");

		System.out.println("3. A code must begin with \\ and must end with \\");

		System.out.println("4. A code must contain at least one lowercase letter and at least one uppercase letter");

		System.out.print("Please enter a code: ");

		// Do While loop to check the requirements for a valid password are met.
		do {
			passWord = code.nextLine();// get input from user

			if (notEmpty(passWord)) {// Call method to Check for null entry

				System.out.println("Input must not be empty.");

				System.out.println("Please try again");

				goodInput = false;// Set boolean to false to stay in the loop.

				continue;// Go to end of loop and re run if false.
			}
			if (!firstCharacter(passWord)) {// Call method to Check First Character

				System.out.println("Code must start with \\.");

				System.out.println("Code is invalid, Please try again");

				goodInput = false;// Set boolean to false to stay in the loop.

				continue;// Go to end of loop and re run if false.

			}
			if (!lastCharacter(passWord)) {// Call method to Check last Character

				System.out.println("Code must end with \\.");

				System.out.println("Code is invalid, Please try again");

				goodInput = false;// Set boolean to false to stay in the loop.

				continue;// Go to end of loop and re run if false.

			}
			if (!hasCorrectLength(passWord)) {// Call method to Check password length

				System.out.println("Code must be between 5 and 15 characters in length.");

				System.out.println("Code is invalid, Please try again");

				goodInput = false;// Set boolean to false to stay in the loop.

				continue;// Go to end of loop and re run if false.

			}
			if (!hasUpperCharacter(passWord)) {// Call method to Check for uppercase Character

				System.out.println("Code must contain at least one uppercase letter.");

				System.out.println("Code is invalid, Please try again");

				goodInput = false;// Set boolean to false to stay in the loop.

				continue;// Go to end of loop and re run if false.

			}
			if (!hasLowerCharacter(passWord)) {// Call method to Check for lowercase character

				System.out.println("Code must contain at least one lowercase letter.");

				System.out.println("Code is invalid, Please try again");

				goodInput = false;// Set boolean to false to stay in the loop.

				continue;// Go to end of loop and re run if false.

			}
			goodInput = true;// set boolean to true to exit loop

		} while (!goodInput);// Stay in loop while condition is false.

		System.out.println("code is valid.");

		code.close();

	}

	// Methods for checking password requirements

	public static boolean firstCharacter(String str) {

		char first = str.charAt(0); // First character of a string

		if (first == ('\\')) // This verifies there is a \ at the start.
		{
			return true;

		} else

			return false;

	}

	public static boolean lastCharacter(String str) {

		int n = str.length(); // Finding string length

		char last = str.charAt(n - 1); // Last character of a string

		if (last == ('\\')) // This verifies there is a \ at the end.
		{
			return true;

		} else

			return false;

	}

	public static boolean hasCorrectLength(String str) {

		int n = str.length(); // Finding string length

		if (n > 5 && n < 15) // This verifies the correct length.
		{
			return true;

		} else

			return false;
	}

	public static boolean hasLowerCharacter(String str) {

		for (int i = 0; i < str.length(); i++) { // For loop to check password for lower case

			char currentCharacter = str.charAt(i);// Assign currentCharacter to each individual letter in input.

			if (Character.isLowerCase(currentCharacter)) {// Check through the input for lower case.

				return true;
			}
		}
		return false;

	}

	public static boolean hasUpperCharacter(String str) {

		for (int i = 0; i < str.length(); i++) { // For loop to check password for upper case

			char currentCharacter = str.charAt(i);// Assign currentCharacter to each individual letter in input.

			if (Character.isUpperCase(currentCharacter)) {// Check through the input for upper case.

				return true;
			}

		}
		return false;

	}

	public static boolean notEmpty(String str) {

		if (str.equals("")) {// Check input for empty

			return true;
		}
		return false;
	}

}
