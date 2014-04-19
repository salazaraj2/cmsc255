/* Alec Salazar
 * CMSC255-901
 * 2014APR12
 * Lab15
*/
/** A subclass of Card to represent a Debit Card */
public class DebitCard extends Card {
	private String cardNumber, cardPin;
	public DebitCard(){
		cardNumber = "";
		cardPin = "";
	}
	public DebitCard(String n, String number, String pin){
		super(n);
		cardNumber = number;
		cardPin = pin;
	}
	public String format(){
		return super.format() + "\nCard number: " + cardNumber + "\nPIN: " + cardPin;
	}
}
