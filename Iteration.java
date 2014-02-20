/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB19
 * Iteration
 */

/**
 * This program processes an input file selected by the user
 * and outputs to stdout, prefixing each line of text 
 * with a line number.
 */

import java.io.*;
import java.util.Scanner;

public class Iteration {

	// This is the private helper method that displays information
	// about the programmer, the course, and the project.
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Project 03");
		System.out.println("Iteration");
		System.out.println("Iteration.java");
		System.out.println();
	}

	public static void main (String[] args) throws FileNotFoundException {
		printHeading();

		//Prompt user for input file and store it
		Scanner in = new Scanner(System.in);
		System.out.print ("Enter the input filename: ");
		String inputFileName = in.next();

		//Try to catch FileNotFoundException before accepting user input
		try {
			//Create file object
			File inputFile = new File(inputFileName);
			//Open a scanner on the file
			Scanner lineScanner = new Scanner(inputFile);

			System.out.println();
			int i = 1;
			//Process file one line at a time starting at line 1
			//until file has no more lines
			while (lineScanner.hasNextLine()) {
				String line = lineScanner.nextLine();
				//If line is nonempty output with line number
				//Obviously this is rather flimsy, would prefer a regexp to detect
				//a line of complete white space
				if (line.length() > 0 && !line.equals(" ")) {
					//Increase this number if user intends to process a
					//Homeric epic or Shakespearean tragedy.
					System.out.printf("%5d. %s\n",i,line);
					i++;
				}
				//If line is blank, output without number
				else {
					System.out.println(line);
				}
			}
			System.out.println();
		}
		catch (FileNotFoundException exception) {
			System.out.println("\nCould not find the file specified. Please try again.\n");
		}
	}
}

