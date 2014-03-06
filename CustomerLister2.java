/*
 * Alec Salazar
 * CMSC255-901
 * 2014MAR06
 * CustomerLister2
 */

/**
 * This program displays strings from an arraylist
 */

import java.util.ArrayList;

public class CustomerLister2 {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 12");
		System.out.println("CustomerLister2");
		System.out.println("CustomerLister2.java");
		System.out.println();
	}

	/** This is a private method to print each element
	 * of an ArrayList of Strings.
	 * @param names accepts a single ArrayList of type String
	 */
	private static void printArrayList(ArrayList<String> names){
		for (String element : names){
			System.out.println(element);
		}
		System.out.println("--------------");
	}

	public static void main (String[] args){
		printHeading();
		final String NAMETOREMOVE = "Meg";
		ArrayList<String> customerName = new ArrayList<String>();
		customerName.add("Chris");
		customerName.add("Lois");
		customerName.add("Meg");
		customerName.add("Peter");
		customerName.add("Stewie");
		System.out.println("Customer List:\n--------------");
		printArrayList(customerName);
		customerName.add(3,"Brian");
		customerName.add(2,"Meg");
		printArrayList(customerName);
		for (int i=0; i < customerName.size(); i++){
			if (customerName.get(i).equals(NAMETOREMOVE)){
				customerName.remove(i);
				i--;
			}
		}
		printArrayList(customerName);
	}
}
