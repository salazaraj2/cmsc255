public class RationaDriver{
	public static void menu{
		System.out.print();
	}
	public static void main (String args[]){
		printHeading();
		Rational rat1 = new Rational(), rat2 = new Rational ();
		do{
			System.out.print("Enter the numerator for rational number #1: ");
		}while(!hasNextInt());
		num = nextInt();
		do{
			System.out.print("Enter the denominator for rational number #1: ");
		}while(!hasNextInt());
		dnm = nextInt();
