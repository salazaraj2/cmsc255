/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB21
 * MaxLab
 */

/**
 * This program will accept a name and title and
 * output as a formal greeting.
 */

import java.io.IOException;
import java.util.Scanner;

public class MaxLab {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 09");
		System.out.println("MaxLab");
		System.out.println("MaxLab.java");
		System.out.println();
	}

	/**
	 * This is the method to determine the larger of two numbers
	 * @param num1,2 Accepts two integers
	 */
	private static int max(int num1, int num2){ 
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}

	/**
	 * This is a method to obtain a number input from the user
	 */
	private static int numGetter() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		while(!in.hasNextInt()) {
			System.out.print("Please enter an integer: ");
			in.next();
		}
		return in.nextInt();
	}

	public static void main (String[] args) throws IOException {
		printHeading();

		//Call numGetter method to obtain int values
		int number1 = numGetter();
		int number2 = numGetter();

		//Call max method inside the parameter of println method call
		System.out.println("The largest number is "+max(number1,number2));
	}
}
