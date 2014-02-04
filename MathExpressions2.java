/*
 * Alec Salazar
 * CMSC255-901
 * 2014JAN28
 * MathExpressions2
 */

//Simple program to accept integer input for Celsius and convert to Fahrenheit 

import java.util.Scanner;

public class MathExpressions2 {

	// This is the private helper method that displays information about the
	// programmer, the course, and the project.
	private static void printHeading(){
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 03");
		System.out.println("MathExpressions2");
		System.out.println("MathExpressions2.java");
		System.out.println();
	}

	public static void main (String[] args){
		printHeading();

		Scanner in = new Scanner(System.in);
		//int tempCelsius;

		//Prompt user for input temperature in Celsius
		System.out.print("Please enter the temperature in Celsius: ");
		int tempCelsius = in.nextInt();

		//Display both values
		System.out.printf("\nYou typed %d\n",tempCelsius);
		//Conversion formula: F=(9*C/5)+32
		System.out.printf("Which equals %6.2f in Fahrenheit\n",(float) ((float) ( 9 * (float) tempCelsius / 5 ) + 32 ));

	}
}
