/* Alec Salazar
 * CMSC255-901
 * 2014JAN23
 * Lab02
*/

public class Expressions {

	private static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 02");
		System.out.println("Expressions");
		System.out.println();
	}

	public static void main(String[] args) {
		printHeading();

		int a = 3;
		int b = 4;
		int c = 5;
		int d = 17;

		System.out.println((a + b) / c);   
		// 3 and 4 are added with sum 7       
		// 7 is divided by 5 with quotient 1 

		System.out.println(a + b / c);       
		// 4 is divided by 5 with quotient 0       
		// 3 is added to 0 with sum 3

		System.out.println(a++);
		//value of a is 3, then
		//1 is added to 3 with sum 4

		System.out.println(a--);
		//value of a is 4 from previous increment, then
		//1 is subtracted from 4 with sum 3

		System.out.println(a + 1);
		//1 is added to 3 with sum 4

		System.out.println(d % c);
		//17 is diveided by 5 with remainder of 2

		System.out.println(d / c);
		//17 is divided by 5 with quotient 3

		System.out.println(d % b);
		//17 is divided by 4 with remainder of 1

		System.out.println(d / b);
		//17 is divided by 4 with quotient 4

		System.out.println(d + a / d + b);
		//3 is divided by 17 with quotient 0
		//17 is added to 0 and 4 with sum 21

		System.out.println((d + a) / (d + b));
		//17 is added to 3 with sum 20
		//17 is added to 4 with sum 21
		//20 is divided by 21 with quotient 0

		System.out.println(Math.sqrt(b));
		//square root of 4 yields 2

		System.out.println(Math.pow(a, b));
		//3 raised to the 4th power yields 81

		System.out.println(Math.abs(-a));
		//absolute value of -3 yields positive 3

		System.out.println(Math.max(a, b));
		//larger of 3 and 4 is 4
	}
}
