/*
 * Alec Salazar
 * CMSC255-901
 * 2014MAR29
 * MatchUp
 */

/** This program scans a source code file for curly braces and outputs
 * the file to stdout with numbers assigned to the braces
 * @param args allows the user to specify the filename on the commandline
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.Character;
import java.util.Scanner;

public class MatchUp {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Project 05");
		System.out.println("MatchUp");
		System.out.println("MatchUp.java");
		System.out.println();
	}

	/**This method looks through an array of Strings and returns the first String
	 * that corresponds to a valid filename
	 * @param args an array of Strings
	 * @return a String containing the validated filename
	 */
	private static String fileValidator(String args[]){
		String inputFileName = "MatchUp.java";
		//Initialize to a safe value
		File inputFile = new File(inputFileName);

		//Check for cmdline arguments and try to use as inputFile
	       	if(args.length >= 1){
			for(int j = 0; j < args.length; j++){
				inputFileName = args[j];
				inputFile = new File(inputFileName);
				if(inputFile.exists()){
					if(args.length > 1){
						System.out.println("This program does not accept options.");
					}
					System.out.println("Using (" + args[j] + ") as the filename.");
					//We found a valid file so exit the loop
					j = args.length;
				}
			}
		}

		//If no file specified on cmdline or file is invalid then request user input
		if(args.length < 1 || !inputFile.exists()){
			System.out.println("Valid file name not specified on command line.\n");
			do{	
				Scanner in = new Scanner(System.in);
				System.out.print ("Please enter the input filename: ");
				inputFileName = in.next();
				inputFile = new File(inputFileName);
			}while(!inputFile.exists());
		}
		return inputFileName;
	}

	public static void main(String args[]) throws FileNotFoundException{
		printHeading();

		File validatedFile = new File(fileValidator(args));
		//We take one line from the input file at a time
		Scanner lineScanner = new Scanner(validatedFile);
		System.out.println("");

		//We need too keep track of the number of each brace so we can find mismatches
		int openBrace = 0, closedBrace = 0;
		while(lineScanner.hasNextLine()){
			String line = lineScanner.nextLine();
			String outputLine = "";
			//Pass along each individual char from input to output so we can
			//find the curly braces and append a number for each
			for(int i = 0; i < line.length(); i++){
				outputLine += line.charAt(i);
				if(line.charAt(i) == '{'){
					openBrace++;
					outputLine += (openBrace - closedBrace);
				}
				else if(line.charAt(i) == '}'){		
					if(closedBrace >= openBrace){
						//In this case the closed brace has no matching opening brace
						outputLine += "0";
					}
					else{
						outputLine += (openBrace - closedBrace);
						closedBrace++;
					}
				}
			}
			System.out.println(outputLine);
		}
		lineScanner.close();
	}
}
