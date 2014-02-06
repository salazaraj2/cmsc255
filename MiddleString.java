/*
 * Alec Salazar
 * CMSC255-901
 * 2014FEB05
 * MiddleString
 */

//Simple program to compare two words and output in lexicographical order
//Test Cases: aaa bbb ccc => bbb
//aaa ccc bbb => bbb
//bbb aaa ccc => bbb
//bbb ccc aaa => bbb
//ccc aaa bbb => bbb
//ccc bbb aaa => bbb
//aaa bbb aaa => aaa
//aaa bbb bbb => bbb
//aaa aaa bbb => aaa

import java.util.Scanner;

public class MiddleString {

	// This is the private helper method that displays information
	// about the programmer, the course, and the project.
	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 06");
		System.out.println("MiddleString");
		System.out.println("MiddleString.java");
		System.out.println();
	}

	public static void main (String[] args) {
		printHeading();

		Scanner in = new Scanner(System.in);
		
		//Prompt for input letter and store
		System.out.print("Enter a word: ");
		String str1 = in.next();
		System.out.print("Enter another word: ");
		String str2 = in.next();
		System.out.print("Enter the last word: ");
		String str3 = in.next();
		String strEmpty;

		//Compare the three words
		//First check for identities
		// a=b || a=c
		if (str1.compareTo(str2) == 0 || str1.compareTo(str3) == 0) {
			System.out.println(str1);
		}
		// b=c
		else if (str2.compareTo(str3) == 0) {
			System.out.println(str2);
		}
		//Six possible orderings
		else {
			//a<b
			if (str1.compareTo(str2) < 0) {
				//if c<a then cab
				if (str1.compareTo(str3) > 0) {
					System.out.println(str1);
				}
				//a<b && a<c :: if b<c then abc
				else if (str2.compareTo(str3) < 0) {
					System.out.println(str2);
				}
				//b>c :: acb
				else {
					System.out.println(str3);
				}
			}
			//a>b
			else {
				//if c<b then cba
				if (str3.compareTo(str2) < 0) {
					System.out.println(str2);
				}
				//a>b && c>b :: if a<c then bac
				else if (str1.compareTo(str3) < 0) {
					System.out.println(str1);
				}
				//a>c :: bca
				else {
					System.out.println(str3);
				}
			}
		}
	}
}
