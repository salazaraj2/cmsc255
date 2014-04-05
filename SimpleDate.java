/*
 * Alec Salazar
 * CMSC255-901
 * 2014APR05
 * SimpleDate
 */

/** A class to represent a date.
 */

public class SimpleDate {
	private int month, day, year;	//instance variables

	/** Default constructor for a SimpleDate that sets the date to 1/1/2000
	 */
	public SimpleDate(){
		month = 1;
		day = 1;
		year = 2000;
	}

	/** Parameterized constructor for a SimpleDate
	 * @param aMonth month
	 * @param aDay day
	 * @param yr year
	 */
	public SimpleDate(int aMonth, int aDay, int yr){
		setMonth(aMonth);
		setDay(aDay);
		setYear(yr);
	}

	//accessor methods
	/** Returns the month of this SimpleDate
	 * @return int
	 */
	public int getMonth(){
		return month;
	}

	/**Returns the day of this SimpleDate
	 * @return int
	 */
	public int getDay(){
		return day;
	}

	/**Returns the year of this SimpleDate
	 * @return int
	 */
	public int getYear(){
		return year;
	}

	//mutator methods
	/**Sets the month of the SimpleDate
	 * @param aMonth a SimpleDate month
	 * @throws IllegalArgumentException invalid month arguments
	 */
	public void setMonth(int aMonth){
		if(aMonth < 1 || aMonth > 12){
			throw new IllegalArgumentException("Invalid month: " + aMonth + " is outside 1-12");
		}
		month = aMonth;
	}

	/**Sets the day of the SimpleDate
	 * @param aDay a day name
	 * @throws IllegalArgumentException invalid day arguments
	 */
	public void setDay(int aDay){
		if(aDay < 1 || aDay > 31){
			throw new IllegalArgumentException("Invalid day: " + aDay + " is outside 1-31");
		}
		day = aDay;
	}

	/**Sets the year of the SimpleDate
	 * @param aYear a year name
	 * @throws IllegalArgumentException year arguments less than 1
	 */
	public void setYear(int aYear){
		if(aYear < 1){
			throw new IllegalArgumentException("Invalid year: " + aYear + " is less than 1");
		}
		year = aYear;
	}

	/**
	 * @return String containing the month, day, year information for this SimpleDate
	 */
	public String toString(){
		String output;
		output = "\nSimpleDate: " + month + "\\" + day;
		output += "\\" + year + "\n";
		return output;
	}
}
