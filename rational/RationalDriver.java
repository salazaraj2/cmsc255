/*
 * Alec Salazar
 * CMSC255-901
 * 2014APR19
 * Project 7 - Rational
 */
import java.lang.Character;
import java.util.Scanner;

/**This is the tester for the Rational class*/
public class RationalDriver{
	/**A method to display the menu to the user and receive the user's input
	 * @return the user's selection*/
	public static char menu(){
		Scanner in = new Scanner(System.in);
		char choice = '5';
		System.out.println("Enter the corresponding number for the desired action");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Test for Equality");
		System.out.println("6. Change 1st rational number");
		System.out.println("7. Change 2nd rational number");
		System.out.println("(Q/q/X/x/Y/y) to exit");
		System.out.println("Any other key for menu");
		choice = in.next().charAt(0);
		return choice;
	}
	/**Establish two rational objects and allow the user to perform basic arithmetic
	 * operations and directly modify or compare the rational numbers*/
	public static void main (String args[]){
		Rational.printHeading();
		int num = 1, dnm = 1;
		char choice = 'm';
		Scanner in = new Scanner(System.in);
		Rational r1 = new Rational(), r2 = new Rational();
		r1.setNum(nonZero('1', "numerator"));
		r1.setDnm(nonZero('1', "denominator"));
		r1.factor();
		System.out.println("Rational Number #1: " + r1.toString());

		r2.setNum(nonZero('2', "numerator"));
		r2.setDnm(nonZero('2', "denominator"));
		r2.factor();
		System.out.println("Rational Number #2: " + r2.toString());
		do{
			if(choice < '1' || choice > '7') choice = menu();
			if(choice >= '1' && choice <= '4'){
				System.out.print(r1.toString());
				if(choice == '1'){
					System.out.println(" + " + r2.toString() + " = ");
					r1.add(r2);
				}	
				else if(choice == '2'){
					System.out.println(" - " + r2.toString() + " = ");
					r1.subtract(r2);
				}	
				else if(choice == '3'){
					System.out.println(" * " + r2.toString() + " = ");
					r1.multiply(r2);
				}	
				else if(choice == '4'){
					System.out.println(" / " + r2.toString() + " = ");
					r1.divide(r2);
				}	
				r1.factor();
				System.out.print(r1.toString() + "\n");
			}
			else if(choice == '5'){
				System.out.println(r1.toString() + " = " + r2.toString() + " : " + r1.equals(r2));
			}	
			else if(choice == '6'){
				r1.setNum(nonZero('1', "numerator"));
				r1.setDnm(nonZero('1', "denominator"));
				r1.factor();
				System.out.println("Rational Number #1: " + r1.toString());
			}	
			else if(choice == '7'){
				r2.setNum(nonZero('2', "numerator"));
				r2.setDnm(nonZero('2', "denominator"));
				r2.factor();
				System.out.println("Rational Number #2: " + r2.toString());
			}	
			System.out.print("Select (m)enu entry or exit: ");
			choice = in.next().charAt(0);
		}while(choice != 'y' && choice != 'Y' && choice != 'q' && choice != 'Q' && choice != 'x' && choice != 'X');
	}

	/**This method prompts the user to input a nonzero number
	 * @param char which rational number to modify
	 * @param String which part of the rational number to modify
	 * @return the value recieved from the user
	 */
	public static int nonZero(char first, String selection){
		Scanner in = new Scanner(System.in);
		int number = 0;
		do{
			System.out.print("Enter the " + selection + " for rational number #" + first + ": ");
			while(!in.hasNextInt())	in.next();
			number = in.nextInt();
			if(number == 0)	System.out.println("Number must be nonzero.");
		}while(number == 0);
		return number;
	}
}
