/*
 * Alec Salazar
 * CMSC255-901
 * 2014APR12
 * Circle
 */
/** This is an implementation of a circle */
public class Circle {

	private double radius;

	/** Default is the unit circle radius = 1*/
	public Circle(){
		setRadius(0);
	}

	/** Use only values greater than 0
	 * @param double value for radius
	 */
	public Circle(double r){
		setRadius(r);
	}

	/** Default is the unit circle, otherwise use the absolute value of the number
	 * @param double number to use for the radius
	 */
	public void setRadius(double r){
		if(r == 0) radius = 1.0;
		else radius = Math.abs(r);
	}

	/** Returns the value of the radius
	 * @return radius r
	 */
	public double getRadius(){
		return radius;
	}

	/** Returns the value of the diameter
	 * @return diameter D = pi * r
	 */
	public double getDiameter(){
		return getRadius() * 2.0;
	}

	/** Returns the value of the circumference
	 * @return circumference C = pi * D
	 */
	public double getCircumference(){
		return getDiameter() * Math.PI;
	}

	/** Returns the value of the area
	 * @return area A = pi * r * r
	 */
	public double getArea(){
		return getRadius() * getRadius() * Math.PI;
	}

	/** Provide information about the circle in String format
	 * @return String containing radius
	 */
	public String toString(){
		return "This is a circle of radius " + getRadius();
	}

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Project 06");
		System.out.println("Circle");
		System.out.println("Circle.java");
		System.out.println();
	}

	public static void main(String args[]){
		printHeading();
	}
}
