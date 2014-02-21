/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB21
 * GreetingLab
 */

/**
 * This program will accept a name and title and
 * output as a formal greeting.
 */

import java.io.IOException;
import java.util.Scanner;

public class GreetingLab {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 09");
		System.out.println("GreetingLab");
		System.out.println("GreetingLab.java");
		System.out.println();
	}

	/**
	 * This is the method to process the name and title
	 * and output the requisite greeting.
	 * @param title The person's formal title
	 * @param givenName The person's first name
	 * @param surname The person's last name
	 */
	private static void greeting(String title, String givenName, String surname) {
		System.out.println("\nDear "+title+". "+givenName+" "+surname+",\n");
	}

	public static void main (String[] args) throws IOException {
		printHeading();

		Scanner in = new Scanner(System.in);
		
		//Prompt user for input names
		System.out.print ("Enter a title: ");
		String title = in.next();
		System.out.print ("Enter your first name: ");
		String givenName = in.next();
		System.out.print ("Enter your last name: ");
		String surname = in.next();

		greeting(title,givenName,surname);
	}
}
