/* Alec Salazar
 * CMSC255-901
 * 2014APR12
 * Lab15
*/
/** A subclass of Card to represent a driver's license */
public class DriverLicense extends Card{
	String expYear;
	public DriverLicense(){
		expYear = "";
	}
	public DriverLicense(String n, String exp){
		super(n);
		expYear = exp;
	}
	public String format(){
		return super.format() + "\nExpiration year: " + expYear;
	}
}
