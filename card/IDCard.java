/* Alec Salazar
 * CMSC255-901
 * 2014APR12
 * Lab15
*/
/** A subclass of Card to represent an ID card */
public class IDCard extends Card{
	private String idNumber;
	public IDCard(){
		idNumber = "";
	}
	public IDCard(String n, String id){
		super(n);
		idNumber = id;
	}
	public String format(){
		return super.format() + "\nID number: " + idNumber;
	}
}
