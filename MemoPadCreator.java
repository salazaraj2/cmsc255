/*
 * Alec Salazar
 * CMSC255-901
 * 2014MAR20
 * MemoPadCreator
 */

/**
 * This program processes input to a memo, storing in a file, adding
 * the date and topic.
 */

import java.util.Date;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MemoPadCreator {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 13");
		System.out.println("MemoPadCreator");
		System.out.println("MemoPadCreator.java");
		System.out.println();
	}

	public static void main (String[] args) throws FileNotFoundException {
		printHeading();

		//Try to catch FileNotFoundException before accepting user output
		try {
			//Create file object
			File outputFile;
			Scanner console = new Scanner(System.in);
			//Prompt user for output file and store it
			do{
				System.out.print ("Enter the output filename: ");
				String outputFileName = console.nextLine();
				outputFile = new File(outputFileName);
			}while(!outputFile.exists());

			PrintWriter memoFile = new PrintWriter(outputFile);
			try {
				boolean done = false;
				do{
					System.out.print("Memo topic (enter -1 to end): ");
					String topic = console.nextLine();
					if (!topic.equals("-1")){
						System.out.print("Memo text: ");
						String message = console.nextLine();
						//Create the new date object and obtain a dateStamp
						Date now = new Date();
						memoFile.println(topic + "\n" + now.toString() + "\n" + message);
					}
					else {
						done = true;
					}
				}while (!done);
			}
			finally {
				//Don't forget to close the file
				console.close();
				memoFile.close();
			}
		}
		catch (FileNotFoundException exception) {
			System.out.println("\nCould not find the file specified. Please try again.\n");
		}
	}
}

