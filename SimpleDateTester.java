/*
 * Alec Salazar
 * CMSC255-901
 * 2014APR05
 * SimpleDateTester
 */

/** This program tests the SimpleDate class
 */

import java.util.ArrayList;
import java.io.PrintWriter;

public class SimpleDateTester {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 14");
		System.out.println("SimpleDateTester");
		System.out.println("SimpleDateTester.java");
		System.out.println();
	}

	public static void main(String args[]) throws IllegalArgumentException{
		printHeading();

		SimpleDate noDate = new SimpleDate();
		SimpleDate dueDate = new SimpleDate();
		SimpleDate starDate = new SimpleDate();
		SimpleDate newYear = new SimpleDate();
		SimpleDate negDate = new SimpleDate();
		ArrayList<SimpleDate> testDates = new ArrayList<SimpleDate>();
		testDates.add(noDate);
		try{
			dueDate = new SimpleDate(4,5,2014);
			testDates.add(dueDate);
		}
		catch(IllegalArgumentException exception){
			System.out.println(exception.getMessage());
		}
		try{
			starDate = new SimpleDate(1,2,2999099);
			testDates.add(starDate);
		}
		catch(IllegalArgumentException exception){
			System.out.println(exception.getMessage());
		}
		try{
			newYear = new SimpleDate(12,31,1999);
			testDates.add(newYear);
		}
		catch(IllegalArgumentException exception){
			System.out.println(exception.getMessage());
		}
		try{
			negDate = new SimpleDate(8,9,-1);
			testDates.add(negDate);
		}
		catch(IllegalArgumentException exception){
			System.out.println(exception.getMessage());
		}

		for(SimpleDate dates : testDates){
			System.out.print(dates.toString());
		}

		for(int i = 0; i < testDates.size(); i++){
			try{
				testDates.get(i).setMonth(testDates.get(i).getMonth()+1);
				testDates.get(i).setDay(testDates.get(i).getDay()+1);
				testDates.get(i).setYear(testDates.get(i).getYear()+1);
				System.out.print(testDates.get(i).toString());
			}
			catch(IllegalArgumentException exception){
				System.out.println(exception.getMessage());
			}
		}

		/*Input validation is needed for programs using SimpleDate class
		for(int j = 0; j < testDates.size(); j++){
			testDates.get(j).setMonth((testDates.get(j).getMonth()+1)%12);
			testDates.get(j).setDay((testDates.get(j).getDay()+1)%31);
			if(testDates.get(j).getYear() < 1){
				testDates.get(j).setYear(1);
			}
			else{
				testDates.get(j).setYear(testDates.get(j).getYear()+1);
			}
			System.out.print(testDates.get(j).toString());
		}
		*/
	}
}
