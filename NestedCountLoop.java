/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB12
 * NestedCountLoop
 */

/** 
   A simple program that prints the sum of integers
*/

import java.util.Scanner;

public class NestedCountLoop {

	// This is the private helper method that displays information
	// about the programmer, the course, and the project.
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 08");
		System.out.println("NestedCountLoop");
		System.out.println("NestedCountLoop.java");
		System.out.println();
	}


	public static void main(String[] args) {
   
		Scanner in = new Scanner(System.in);
		printHeading();
		int limit = -1;
		do {
			System.out.print("Please enter a positive integer: ");
			while (!in.hasNextInt()) {
				System.out.print("Please enter an integer: ");
				in.next();
			}
			limit = in.nextInt();
		} while (limit <= 0);
		for (int i = 1; i <= limit; i++) {
			long total = 0;
			for (int j = 1; j <= i; j++) {
				total+=j;
				System.out.println("The sum of positive integers from 1 to "+ j +" is " + total);
			}
		}
	}
}
