/*
 * Alec Salazar
 * CMSC255-901
 * 2014MAR20
 * MemoPadReader
 */

/**
 * This program displays memos stored in a file
 */

import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.lang.Character;
import java.util.Scanner;

public class MemoPadReader {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 13");
		System.out.println("MemoPadReader");
		System.out.println("MemoPadReader.java");
		System.out.println();
	}

	public static void main (String[] args) throws IOException {
		printHeading();

		//Try to catch IOException before accepting user output
		try {
			File inputFile;
			Scanner console = new Scanner(System.in);
			//Prompt user for input file and store it
			do{
				System.out.print ("Enter the input filename: ");
				String inputFileName = console.nextLine();
				inputFile = new File(inputFileName);
			}while(!inputFile.exists());

			Scanner readFile = new Scanner(inputFile);
			try {
				boolean done = false;
				while(readFile.hasNextLine() && !done){
					String topic = readFile.nextLine();//first line
					String dateStamp = readFile.nextLine();//second line
					String message = readFile.nextLine();//third line
					System.out.println("\nTopic: " + topic + "\nTime:  " + dateStamp + "\n" + message);

					if(readFile.hasNextLine()){
						System.out.print("Press (n) to exit, or (y) to read the next memo: ");
						String ans = console.nextLine();
						if(ans.equalsIgnoreCase("n")){
							done = true;
						}
					}
					else{
						System.out.println("\nEnd of memos.");
					}
				}
			}
			finally {
				//Don't forget to close the file
				console.close();
				readFile.close();
			}
		}
		catch (IOException exception) {
			System.out.println("\nError reading the file. Please try again.\n");
		}
	}
}

