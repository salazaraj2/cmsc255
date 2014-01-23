/* Alec Salazar
 * CMSC255-901
 * 2014JAN21
 * Lab02
*/

public class VariableDefinitions{

	private static void printHeading(){
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Lab 02");
		System.out.println("Variable Definitions");
		System.out.println();
	}

	public static void main (String[] args){
		printHeading(); // this statement calls the printHeading method

		byte numPeople = 3;
		double itemPrice = 32.32;
		String greeting = "HI";
		boolean doneFlag = false;
		char seekInput = 'a';
		int classRoomNumber = 207;
		float dinnerPrice = 30.0f;
		String dinnerGuest = "Tina Fey";
		boolean addTax = true;
		char keyPress = 'x';

		int count = 256;
		float total = 6553.6f;
		String name = "Oscar the Grouch";
		char stopKey = 'q';
		String dayOfTheWeek = "Friday";
		boolean stopFlag = false;
		double temperatureReading = (total / count) ;
		byte numPets = 4;
		char upKey = 'w';
		long reallyBigNumber = 32768;

		System.out.println("Part A Variables:");
		System.out.printf("numPeople = %d\n",numPeople);
		System.out.printf("itemPrice = %8.2f\n",itemPrice);
		System.out.printf("greeting = %s\n",greeting);
		System.out.printf("doneFlag = %s\n",doneFlag);
		System.out.printf("seekInput = %s\n",seekInput);
		System.out.printf("classRoomNumber = %4d\n",classRoomNumber);
		System.out.printf("dinnerPrice = %8.2f\n",dinnerPrice);
		System.out.printf("dinnerGuest = %s\n",dinnerGuest);
		System.out.printf("addTax = %s\n",addTax);
		System.out.printf("keyPress = %s\n",keyPress);
		System.out.println();

		System.out.println("Part B Variables:");
		System.out.printf("count = %d\n",count);
		System.out.printf("total = %8.2f\n",total);
		System.out.printf("name = %s\n",name);
		System.out.printf("stopKey = %s\n",stopKey);
		System.out.printf("dayOfTheWeek = %s\n",dayOfTheWeek);
		System.out.printf("stopFlag = %s\n",stopFlag);
		System.out.printf("temperatureReading = %8.2f\n",temperatureReading);
		System.out.printf("numPets = %d\n",numPets);
		System.out.printf("upKey = %s\n",upKey);
		System.out.printf("reallyBigNumber = %d\n",reallyBigNumber);
		System.out.println();

		numPeople *= 3;
		itemPrice += 51.47;
		greeting = "BYE";
		doneFlag = true;
		seekInput = 'h';
		classRoomNumber = 1232;
		dinnerPrice += 24.9;
		dinnerGuest = "Sarah Silverman";
		addTax = false;
		keyPress = 'q';

		System.out.println("Part A Variable Values Reassigned:");
		System.out.printf("numPeople = %d\n",numPeople);
		System.out.printf("itemPrice = %8.2f\n",itemPrice);
		System.out.printf("greeting = %s\n",greeting);
		System.out.printf("doneFlag = %s\n",doneFlag);
		System.out.printf("seekInput = %s\n",seekInput);
		System.out.printf("classRoomNumber = %4d\n",classRoomNumber);
		System.out.printf("dinnerPrice = %8.2f\n",dinnerPrice);
		System.out.printf("dinnerGuest = %s\n",dinnerGuest);
		System.out.printf("addTax = %s\n",addTax);
		System.out.printf("keyPress = %s\n",keyPress);
		System.out.println();

		final byte SMALL = 127;
		final short MEDIUM = 32767;
		final int LARGE = (SMALL + 1) * (MEDIUM + 1);
		final long HUGE = (SMALL + 1) * LARGE; // * 2); so big it's negative
		final float LABOR_WAGE = ((SMALL + 1) / 16) ;
		final double COST_OF_LIVING = Math.pow( HUGE , SMALL); 
		final char THE_LETTER_OF_THE_DAY = 'p';
		final String BROUGHT_TO_YOU_BY = "the color blue";

		//SMALL = 126; //error: cannot assign a value to final variable SMALL

		System.out.println("Eight Basic Data Types:");
		System.out.printf("SMALL = %d\n",SMALL);
		System.out.printf("MEDIUM = %d\n",MEDIUM);
		System.out.printf("LARGE = %d\n",LARGE);
		System.out.printf("HUGE = %d\n",HUGE);
		System.out.printf("LABOR_WAGE = %8.2f\n",LABOR_WAGE);
		System.out.printf("COST_OF_LIVING = %20f\n",COST_OF_LIVING);
		System.out.printf("THE_LETTER_OF_THE_DAY = %s\n",THE_LETTER_OF_THE_DAY);
		System.out.printf("BROUGHT_TO_YOU_BY = %s\n",BROUGHT_TO_YOU_BY);
		System.out.println();

	}
}
