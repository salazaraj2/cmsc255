/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB05
 * StringEqual 
 */

//Simple program to compare two words and print whether or not they are equal

import java.util.Scanner;

public class StringEqual {

	// This is the private helper method that displays information
	// about the programmer, the course, and the project.
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 06");
		System.out.println("StringEqual");
		System.out.println("StringEqual.java");
		System.out.println();
	}

	public static void main (String[] args) {
		printHeading();

	        String str1 = "abcd";
	        String str2 = "abcdefg";
	        String str3 = str1 + "efg";
	        System.out.println("str2 = " + str2);
	        System.out.println("str3 = " + str3);
	        if (str2.compareTo(str3) == 0)
	            System.out.println("The strings are equal");
	        else
	            System.out.println("The strings are not equal");
	}
}
