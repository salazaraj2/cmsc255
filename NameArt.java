//***************************************************************************
// Alec Salazar
// CMSC255-901
// 2014JAN23
// Project 1 - Your Name in Code
//***************************************************************************
//Simple program to display a name using '*'

public class NameArt{

	// This is the private helper method that displays information about the
	// programmer, the course, and the project.
	private static void printHeading(){
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Programming Project 1");
		System.out.println("Your Name in Code");
		System.out.println("NameArt.java");
		System.out.println();
	}

	public static void main (String[] args){
		printHeading(); // this statement calls the printHeading method
		System.out.println("\t  *    *      ****   ***");
		System.out.println("\t * *   *      *     *   ");
		System.out.println("\t*****  *      ****  *   ");
		System.out.println("\t*   *  *      *     *   ");
		System.out.println("\t*   *  *****  ****   ***");
	}
}
