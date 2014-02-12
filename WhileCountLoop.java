/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB11
 * WhileCountLoop
 */

/** 
   A simple program that prints the sum of integers
*/

import java.util.Scanner;

public class WhileCountLoop {

	// This is the private helper method that displays information
	// about the programmer, the course, and the project.
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 08");
		System.out.println("WhileCountLoop");
		System.out.println("WhileCountLoop.java");
		System.out.println();
	}


	public static void main(String[] args) {
   
		Scanner in = new Scanner(System.in);
		printHeading();
		int i = 1;
		int limit = -1;
		long total = 0;
		do {
			System.out.print("Please enter a positive integer: ");
			while (!in.hasNextInt()) {
				System.out.print("Please enter an integer: ");
				in.next();
			}
			limit = in.nextInt();
		} while (limit <= 0);
		while (i <= limit) {
			total+=i;
			i++;
		}
		System.out.println("The sum of the integers 1 through "+ limit +" = " + total);
	}
}
