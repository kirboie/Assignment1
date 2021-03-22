
/* Course: 2020/2021 C2 Object Oriented Programming with Java
 * Student Name: Leon Kirby
 * Student Number: 20215594
 * Question: c2a1q3_2020
 */
import java.util.Scanner;// Import scanner

public class c2a1q3_2020_LeonKirby {

	public static void main(String[] args) {

		int num = 0;// Variable for valid number input

		String userInput;// string for input before parsing to int.

		boolean isValid = false;// boolean to set condition for while loop

		Scanner scan = new Scanner(System.in);// set up scanner

		while (isValid == false) {// while loop to check for valid input

			System.out.println("Enter an integer that is odd, in the range of 3 to 15 (inclusive):");

			userInput = scan.nextLine();// get input from user

			try {// try block to catch error when non integer is input

				num = Integer.parseInt(userInput);

			}

			catch (NumberFormatException e) {// catch exception error

				System.out.print("Invalid entry, number must be an integer. \n");

				continue;// Go to boolean condition controlling while loop and restart routine if not
				// true.

			}
			if (num % 2 == 0) {

				System.out.println("invalid entry, number must be in range, and must be odd.");// check for odd number

			} else if (num < 3 || num > 15) {

				System.out.println("invalid entry, number must be in range, and must be odd.");// check for number in
				// range.

			} else if (num % 2 != 0) {// check for odd number

				num = ((num + 1) / 2);// convert num to print the correct number of rows

				scan.close();// close the scanner

				isValid = true;// set boolean to true to exit while loop
			}
		}
		drawDiamond(num);// call method drawDiamond and run with final num.

	}

	public static void drawDiamond(int rows) { // Method for drawing diamond.

		for (int a = 1; a <= rows; a++) {

			for (int b = rows; b > a; b--) {// start of routine to draw top part of diamond.

				System.out.print(" ");
			}
			System.out.print("@");

			for (int c = 1; c < 2 * (a - 1); c++) {

				System.out.print(" ");
			}
			if (a == 1) {

				System.out.println("");

			} else {

				System.out.println("@");
			}
		}
		for (int a = rows - 1; a >= 1; a--) {

			for (int b = rows; b > a; b--) {// start of routine to draw bottom part of diamond, its the same routine as
				// above with the logic reversed.

				System.out.print(" ");
			}

			System.out.print("@");

			for (int c = 1; c < 2 * (a - 1); c++) {

				System.out.print(" ");

			}
			if (a == 1)

				System.out.println("");

			else

				System.out.println("@");
		}

	}
}