/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB11
 * SimpleLoop
 */

/** 
   A simple program that prints a loop control variable.
*/

public class SimpleLoop {

	// This is the private helper method that displays information
	// about the programmer, the course, and the project.
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 08");
		System.out.println("SimpleLoop");
		System.out.println("SimpleLoop.java");
		System.out.println();
	}


	public static void main(String[] args) {
   
		printHeading();
		int i = 6;
		int limit = 100;
		while (i < limit) {
			System.out.println("i = " + i);
			i+=2;
		}
	}
}
