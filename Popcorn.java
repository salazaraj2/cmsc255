/*
 * Alec Salazar
 * CMSC255-901
 * 2014MAR06
 * Popcorn
 */

/**
 * This program processes an input file selected by the user
 * and outputs in a grid to stdout, parsing each array for
 * the appropriate row name and production count.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.Character;
import java.util.Scanner;

public class Popcorn {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Project 04");
		System.out.println("Popcorn");
		System.out.println("Popcorn.java");
		System.out.println();
	}

	/** This is the method to extract the name of the farm
	 * and the popcorn yield from each line.
	 * @param popcornFarm accepts a single string for parsing
	 */
	private static void popcornYield (String popcornFarm) {
		Scanner lineScanner = new Scanner(popcornFarm);
		String farmName = lineScanner.next();
		while(!lineScanner.hasNextDouble()){
			farmName+=" " + lineScanner.next();
		}
		//byte i = (byte) farmName.length();
		farmName = farmName.trim();
		if (farmName.charAt(farmName.length()-1) == ','){
		       	farmName = farmName.substring(0,farmName.length()-1);
		}
		float farmSize = (float) 0.0;
		if (lineScanner.hasNextDouble()){
			farmSize = (float) lineScanner.nextDouble();
		}
		int popcornJars = 0; //Careful, don't want to allow divide by zero
		if (lineScanner.hasNextInt()) {
			popcornJars = lineScanner.nextInt();
		}
		if (popcornJars <= 0){
			System.out.printf("\nError in text data. Entry %s %f %d",farmName,farmSize,popcornJars);
			System.out.println("\nPlease ensure entries are properly formatted.");
			System.out.println("Skipping this entry to prevent runtime error.");
			return;
		}
		byte popStars = (byte) (popcornJars/(farmSize * 25));
		String starMarks = "";
		for (byte j = 0;j < popStars;j++){
			starMarks+="*";
		}
		System.out.printf("\n%-30s",farmName);
		if (popStars < 20) {
			System.out.printf("%-20s|",starMarks);
		}
		else {
			System.out.printf("%-20s#",starMarks.substring(0,20));
			System.out.printf("%-4s",starMarks.substring(20));
		}
		return;
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
			System.out.println("header to chart");
			//Process file one line at a time
			//until file has no more lines
			while (lineScanner.hasNextLine()) {
				popcornYield(lineScanner.nextLine());
			}
			System.out.println();
		}
		catch (FileNotFoundException exception) {
			System.out.println("\nCould not find the file specified. Please try again.\n");
		}
		in.close();
	}
}

