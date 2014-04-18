/*
 * Alec Salazar
 * CMSC255-901
 * 2014APR17
 * Lab 16 - Poodle
 */

/**This class creates Poodle type which is a fancy, pet dog with color*/
public class Poodle extends Dog implements Pet, Fancy{
	private String color;

	/**Default constructor passes along appropriate parameters to Dog
	 * and sets the color
	 */
	public Poodle(String col, String aname, double wgt, double ag){
		super(aname, wgt, ag);
		color = col;
	}

	/**Implementing the abstract class from Dog*/
	public void sleep(){
		System.out.println(super.getName() + " is sleeping");
	}

	/**Implementing method from Pet interface*/
	public void walk(){
		System.out.println(super.getName() + " is ready to go outside!!!");
	}

	/**Implementing method from Pet interface*/
	public void feed(){
		System.out.println(super.getName() + " is hungry!");
	}

	/**Implementing method from Fancy interface*/
	public void groom(){
		System.out.println(super.getName() + " should be groomed");
	}

	/**Append the local var color to Dog toString info*/
	public String toString(){
		return super.toString() + "\nColor: " + color + "\n";
	}

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 16 - Poodle");
		System.out.println();
	}

	public static void main(String args[]){
		printHeading();
	}
}
