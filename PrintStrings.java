/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB05
 * PrintStrings
 */

//Simple program to compare two words and output in lexicographical order

import java.util.Scanner;

public class PrintStrings {

	// This is the private helper method that displays information
	// about the programmer, the course, and the project.
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 06");
		System.out.println("PrintStrings");
		System.out.println("PrintStrings.java");
		System.out.println();
	}

	public static void main (String[] args) {
		printHeading();

		Scanner in = new Scanner(System.in);
		
		//Prompt for input letter and store
		System.out.print("Enter a word: ");
		String str1 = in.next();
		System.out.print("Enter another word: ");
		String str2 = in.next();
		System.out.println("I will now print the words in lexicographical order: ");
		//Compare the two words
		if (str1.compareTo(str2) < 0) {
			System.out.println("The word '"+str1+"' goes before '"+str2);
		}
		else if (str1.compareTo(str2) > 0) {
			System.out.println("The word '"+str2+"' goes before '"+str1);
		}
		else {
			System.out.println("The words are the same.");
		}
	}
}
