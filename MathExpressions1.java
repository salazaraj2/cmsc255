/*
 * Alec Salazar
 * CMSC255-901
 * 2014JAN28
 * MathExpressions1
 */

//Simple program to demonstrate the difference between integer division and float division

public class MathExpressions1 {

	// This is the private helper method that displays information about the
	// programmer, the course, and the project.
	private static void printHeading(){
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 03");
		System.out.println("MathExpressions1");
		System.out.println("MathExpressions1.java");
		System.out.println();
	}

	public static void main (String[] args){
		printHeading();

		final int NUM = 7;
		final int DEM = 4;
		int result = (NUM / DEM);  //assign result equal to quotient for first print command
		
		System.out.println(NUM + " / " + DEM + "  using integer division equals  " + result );

		//make sure to cast integer to float
		System.out.println(NUM + " / " + DEM + "  using floating-point division equals  " + (float) ((float) NUM / (float) DEM) );

		result = (NUM % DEM);  //assign result equal to remainder for last print command
		System.out.println(NUM + " modulo " + DEM + "  equals  " + result );

	}
}
