/* Alec Salazar
 * CMSC255-901
 * 2014JAN21
 * Lab01b
*/
//**********************************************************************
//	Alec Salazar
// PrintName application
// This application inputs a name and prints it in two different formats
//  
//**********************************************************************
import java.util.Scanner;

public class PrintName {
 
	static final char COMMA = ',';
	static final char BLANK = ' ';

	public static void main(String[] args){
	String first;                        // Person's first name
	String last;                         // Person's last name
	String middle;                       // Person's middle initial
	String firstLast;                    // Name in first-last format
	String lastFirst;                    // Name in last-first format
	Scanner in;                          // Input object
 
	in = new Scanner(System.in);
	System.out.print("Enter first name: ");      // Prompt for first name
	first = in.nextLine();                       // Get first name
        System.out.print("Enter last name: ");       // Prompt for last name
	last = in.nextLine();                        // Get last name
	System.out.print("Enter middle initial: ");  // Prompt for middle initial
	middle = in.nextLine();                      // Get middle initial
		// Generate first format	
	firstLast = first + BLANK + last;            
	System.out.println("Name in first-last format is " + firstLast);
		// Generate second format
	lastFirst = last + COMMA + BLANK + first + COMMA + BLANK; 
		// I don't usually place a comma between my first name and middle initial
	System.out.println("Name in last-first-initial format is " + lastFirst + middle + ".");
	}
}
