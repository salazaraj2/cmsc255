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

	/** This is the method to extract the name and size
	 */
	public static void main(String args[]) throws FileNotFoundException{
		printHeading();
		String inputFileName = "MatchUp.java";
		File inputFile;
	        if(args.length >= 1){
			inputFileName = args[args.length - 1];
			if(args.length > 1){
				System.out.println("Using last parameter (" + args[args.length - 1] + ") as the filename.");
			}
		}
		inputFile = new File(inputFileName);
		try{
			if(args.length < 1 || !inputFile.exists()){
				System.out.println("Valid file name not specified on command line.");
				do{	
					Scanner in = new Scanner(System.in);
					System.out.print ("\nPlease enter the input filename: ");
					inputFileName = in.next();
					inputFile = new File(inputFileName);
				}while(!inputFile.exists());
			}
			System.out.println("");
		}
		catch (Exception exception){
			exception.printStackTrace();
		}
		Scanner lineScanner = new Scanner(inputFile);
		int openBrace = 0, closedBrace = 0;
		while(lineScanner.hasNextLine()){
			String line = lineScanner.nextLine();
			String outputLine = "";
			for(int i = 0; i < line.length(); i++){
				outputLine += line.charAt(i);
				if(line.charAt(i) == '{'){
					openBrace++;
					outputLine += (openBrace - closedBrace);
				}
				else if(line.charAt(i) == '}'){		
					if(closedBrace >= openBrace){
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
