/* Alec Salazar
 * CMSC255-901
 * 2014JAN23
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
		System.out.println("numPeople = "+numPeople);
		System.out.printf("itemPrice = %8.2f\n",itemPrice);
		System.out.println("greeting = "+greeting);
		System.out.println("doneFlag = "+doneFlag);
		System.out.println("seekInput = "+seekInput);
		System.out.println("classRoomNumber = "+classRoomNumber);
		System.out.println("dinnerPrice = "+dinnerPrice);
		System.out.println("dinnerGuest = "+dinnerGuest);
		System.out.println("addTax = "+addTax);
		System.out.println("keyPress = "+keyPress);
		System.out.println();

		System.out.println("Part B Variables:");
		System.out.println("count = "+count);
		System.out.println("total = "+total);
		System.out.println("name = "+name);
		System.out.println("stopKey = "+stopKey);
		System.out.println("dayOfTheWeek = "+dayOfTheWeek);
		System.out.println("stopFlag = "+stopFlag);
		System.out.println("temperatureReading = "+temperatureReading);
		System.out.println("numPets = "+numPets);
		System.out.println("upKey = "+upKey);
		System.out.println("reallyBigNumber = "+reallyBigNumber);
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
		System.out.println("numPeople = "+numPeople);
		System.out.println("itemPrice = "+itemPrice);
		System.out.println("greeting = "+greeting);
		System.out.println("doneFlag = "+doneFlag);
		System.out.println("seekInput = "+seekInput);
		System.out.println("classRoomNumber = "+classRoomNumber);
		System.out.println("dinnerPrice = "+dinnerPrice);
		System.out.println("dinnerGuest = "+dinnerGuest);
		System.out.println("addTax = "+addTax);
		System.out.println("keyPress = "+keyPress);
		System.out.println();

		final byte SMALL = 127;
		final short MEDIUM = 32767;
		final int LARGE = (SMALL + 1) * (MEDIUM + 1);
		final long HUGE = (SMALL + 1) * LARGE;
		final double SPEED_OF_LIGHT = 300000000;
		final float SPEED_OF_SOUND =  (float) (SPEED_OF_LIGHT / 1000);
		final char THE_LETTER_OF_THE_DAY = 'p';
		final boolean BLUE_SKY = true;

		//SMALL = 126; //error: cannot assign a value to final variable SMALL

		System.out.println("Eight Basic Data Types:");
		System.out.println("SMALL = "+SMALL);
		System.out.println("MEDIUM = "+MEDIUM);
		System.out.println("LARGE = "+LARGE);
		System.out.println("HUGE = "+HUGE);
		System.out.println("SPEED_OF_SOUND = "+ SPEED_OF_SOUND + "m/s");
		System.out.println("SPEED_OF_LIGHT = "+ SPEED_OF_LIGHT + "m/s");
		System.out.println("THE_LETTER_OF_THE_DAY = "+ THE_LETTER_OF_THE_DAY); 
		System.out.println("BLUE_SKY = "+BLUE_SKY);
		System.out.println();

	}
}
