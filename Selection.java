/*
 * Alec Salazar
 * CMSC255-901
 * 2014JAN30
 * Selection
 */

//Simple program to output the number corresponding to a letter as grouped on a telephone dial pad. 

import java.util.Scanner;

public class Selection {

	// This is the private helper method that displays information about the
	// programmer, the course, and the project.
	private static void printHeading(){
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 04");
		System.out.println("Selection");
		System.out.println("Selection.java");
		System.out.println();
	}

	public static void main (String[] args){
		printHeading();

		Scanner in = new Scanner(System.in);
		byte dialNum = -1;
		//Prompt for input letter and store
		System.out.print("Enter an upper-case letter to find the corresponding number on a telephone dial pad: ");
		char inputLetter = in.next().charAt(0);
		//Check that a capital letter was entered
		if (inputLetter >= 'A' && inputLetter <= 'Z') {
			//Compare against telephone dial pad groups
			if (inputLetter <= 'L') {
				if (inputLetter <= 'F'){
					if (inputLetter <= 'C') {
						dialNum = 2;
					}
					else {
						dialNum = 3;
					}
				}
				else {
					if (inputLetter <= 'I') {
						dialNum = 4;
					}
					else {
						dialNum = 5;
					}
				}
			}
			else {
				if (inputLetter <= 'S') {
					if (inputLetter <= 'O') {
						dialNum = 6;
					}
					else {
						dialNum = 7;
					}
				}
				else {
					if (inputLetter <= 'V') {
						dialNum = 8;
					}
					else {
						dialNum = 9;
					}
				}
			}
			//Output correct number along with input letter
			System.out.printf("You entered '"+inputLetter+"', which corresponds to %d.\n",dialNum);
		}
		else {
			//Output error for lowercase, or error info for non-alpha chars 
			if (inputLetter >= 'a' && inputLetter <='z') {
				System.out.println("Error. You entered '"+ inputLetter +"'.\nPlease enter your letter in upper-case.");
			}
			else {
				//
				System.out.println("Error. This program only matches alphabetic characters.\nPlease enter a character from A-Z.");
			}
		}

		if (dialNum<0) {
			System.out.println("Hmmm. Programming logic fail.");
		}

	}
}
