/*
 * Alec Salazar
 * CMSC255-901
 * 2014MAR06
 * CustomerLister1
 */

/**
 * This program displays strings from an array
 */

import java.util.Arrays;

public class CustomerLister1 {

	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 12");
		System.out.println("CustomerLister1");
		System.out.println("CustomerLister1.java");
		System.out.println();
	}

	/** This is a private method to print each element
	 * of an Array of Strings.
	 * @param names accepts a single Array of type String
	 */
	private static void printArray(String[] names){
		for (String element : names){
			System.out.println(element);
		}
		System.out.println("--------------");
	}

	public static void main (String[] args){
		printHeading();
		final String NAMETOREMOVE = "Meg";
		final int ARRAYSIZE = 7;
		String[] customerName = {"Chris","Lois","Meg","Peter","Stewie"};
		int currentSize = 5;
		customerName = Arrays.copyOf(customerName,ARRAYSIZE);
		System.out.println("Customer List:\n--------------");
		printArray(customerName);
		customerName[6] = customerName[4];
		customerName[5] = customerName[3];
		customerName[3] = "Meg";
		customerName[4] = "Brian";
		currentSize += 2;
		printArray(customerName);
		for (int i=0; i < currentSize; i++){
			if (customerName[i].equals(NAMETOREMOVE)){
				for(int j = i; j < currentSize - 1; j++){
					customerName[j]=customerName[j+1];
				}
				customerName[currentSize - 1] = null;
				i--;
				currentSize--;
			}
		}
		printArray(customerName);
	}
}
