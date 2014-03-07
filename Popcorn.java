/*
 * Alec Salazar
 * CMSC255-901
 * 2014MAR06
 * Popcorn
 */

/**
 * This program processes an input file selected by the user
 * and outputs in a grid to stdout, parsing each line for
 * the appropriate row name and production count.
 */

import java.util.ArrayList;
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

	/** This is the method to extract the name and size
	 * of the farm and the popcorn yield from each line.
	 * @param popcornFarm accepts a single string for parsing
	 * @return boolean false if data was unable to be read
	 */
	private static boolean popcornYield (String popcornFarm) {
		//I think a float should be fine since we'll be discarding the decimal later
		float farmSize = (float) 0.0;
		int popcornJars = 0, i = 0;
		//First get the farm name, which should be at the front
		while(i < popcornFarm.length() && !Character.isDigit(popcornFarm.charAt(i))){
			i++;
		}
		String farmName = popcornFarm.substring(0,i);
		//Cleanup unnecessary white space and remove the trailing comma
		farmName = farmName.trim();
		if (farmName.charAt(farmName.length()-1) == ','){
		       	farmName = farmName.substring(0,farmName.length()-1);
		}
		//Now we can drop the name from the string
		popcornFarm = popcornFarm.substring(i);
		Scanner lineScanner = new Scanner(popcornFarm);
		//The acreage should be listed after the farm name
		if (lineScanner.hasNextDouble()){
			farmSize = (float) lineScanner.nextDouble();
		}
		//The production count should be after the acreage
		if (lineScanner.hasNextInt()){
			popcornJars = lineScanner.nextInt();
		}
		//If the numbers aren't useable
		if (popcornJars <= 0||farmSize <= 0){
			return false;
		}
		//This number isn't expected to go beyond 24, well within the range of a byte
		byte popStars = (byte) (popcornJars/(farmSize * 25));
		String starMarks = "";
		//This creates the string to output next to the farm's name
		for (byte j = 0;j < popStars;j++){
			starMarks+="*";
		}
		//Output the farm's name
		System.out.printf("\n%-30s",farmName);
		//If they didn't make the target:
		if (popStars < 20) {
			System.out.printf("%-19s|",starMarks);
		}
		//If they did make the target:
		else {
			System.out.printf("%-19s#",starMarks.substring(0,19));
			System.out.printf("%-4s",starMarks.substring(20));
		}
		//We made it to the end so the data should be good
		return true;
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

			//Print out the header for the chart
			System.out.printf("\n%20s%-20s","","Popcorn Co-op");
			System.out.printf("\n\n%30s%-20s","","Production in Hundreds");
			System.out.printf("\n%30s%-20s","","of Pint Jars per Acre");
			System.out.printf("\n%-30s","Farm Name");
			System.out.printf("   1   2   3   4   5   6\n");
			System.out.printf("%30s%-20s","","---|---|---|---|---|---|");
			//This will keep track of lines with errors
			ArrayList<Integer> errors = new ArrayList<Integer>();
			int errorLines = 1;
			//printErrors is the canary, goodData tells us whether or not
			//to add that line number to the error message
			boolean printErrors = false, goodData = true;
			//Process file one line at a time until file has no more lines
			//and pass to the parsing method
			while (lineScanner.hasNextLine()) {
				goodData = popcornYield(lineScanner.nextLine());
				if(!goodData) {
					errors.add(errorLines);
					printErrors = true;
				}
				errorLines++;
			}
			if(printErrors){
				System.out.println("\n\nError in text data. Line number(s): "+ errors);
			}
		}
		catch (FileNotFoundException exception) {
			System.out.println("\nCould not find the file specified. Please try again.\n");
		}
		//Don't forget to close the file
		in.close();
	}
}

