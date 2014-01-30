package Lab1;

import java.util.Scanner;


/**
 * This Palindrome class takes five digits integer value from user and determines whether it is Palindrome or not.
 * If user inputs number less than five digits number it ask for next valid input.
 * @author srizna
 *
 */

public class Palindrome {
	

	/**
	 * This method takes the user's name as input
	 * @author srizna
	 */
	private static void enterNumber() {
		// TODO Auto-generated method stub
		int entered_number;
		int temp;
		int sum = 0;
		System.out.println("Enter 5 digits number:");
		Scanner number = new Scanner(System.in);
		entered_number = number.nextInt();
		temp = entered_number;
		checkForPalindrome(entered_number, temp);
	}
	
	/**
	 * This method firstly checks for length of given number whether its five digits or not and then checks for Palindrome.
	 * @author srizna
	 * @param entered_number:user's five digits integer value
	 * @param temp:temporary value to store given input so that to compare it later.
	 */
	private static void checkForPalindrome(int entered_number, int temp) {
		// TODO Auto-generated method stub
		int remainder;
		int sum = 0;
		if (entered_number > 10000 && entered_number < 99999) {

			for (int i = 0; i < 5; i++) {
				remainder = entered_number % 10;
				entered_number = entered_number / 10;
				sum = sum * 10 + remainder;

			}
			display(sum, temp);
		} else {
			System.out.println("Need to give 5 digits number");
			enterNumber();
		}
	}
	

	/**
	 * This method displays whether the given input is palindrome or not.
	 * @author srizna
	 * @param sum:final stored value
	 * @param temp:temporary stored value
	 */
	private static void display(int sum, int temp) {
		// TODO Auto-generated method stub
		if (sum == temp) {
			System.out.println("The number" + " " + temp + " "
					+ "is PALINDROME");
		} else {
			System.out.println("The number" + "  " + temp + " "
					+ "is not  PALINDROME");
		}
	}

		public static void main(String[] arg) {

		enterNumber();
	}
}
