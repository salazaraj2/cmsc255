/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB07
 * Selection
 */

//Simple program to calculate and output the diameter, circumference or area of a circle
//based upon the radius given as input.

import java.util.Scanner;

public class Selection {

	// This is the private helper method that displays information about the
	// programmer, the course, and the project.
	private static void printHeading(){
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Project 2");
		System.out.println("Selection");
		System.out.println("Selection.java");
		System.out.println();
	}

	public static void main (String[] args){
		printHeading();

		Scanner in = new Scanner(System.in);

		//Prompt user to input radius
		System.out.print("Please enter the radius of the circle: ");
		while(!in.hasNextDouble()) {
			//ensure a number is entered
			System.out.print("Please enter a number: ");
			in.next();
		}
		final double radius = in.nextDouble();

		//Prompt user to select a calculation
		System.out.print("Please choose a calculation of (D)iameter, (C)ircumference or (A)rea: ");
		char calc = in.next().toUpperCase().charAt(0);

		if (calc == 'A') { 
			//Area=pi*r^2
			System.out.printf("A circle with radius=%10.2f has area=%10.2f.\n",radius,(radius*radius*Math.PI));
		}
		else if (calc == 'C') { 
			//C=2*pi*r
			System.out.printf("A circle with radius=%10.2f has circumference=%10.2f.\n",radius,(2*radius*Math.PI));
		}
		else if (calc == 'D') {
			//D=2*r
			System.out.printf("A circle with radius=%10.2f has diameter=%10.2f.\n",radius,(2*radius));
		}
		else {
			//any other value is not in the domain
			System.out.println("Option not recognized. Next time please type 'D', 'C' or 'A'.");
		}
	}
}
