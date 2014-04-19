/*
 * Alec Salazar
 * CMSC255-901
 * 2014APR19
 * Project 7 - Rational
 */
/**This class represents a rational number, an integer over another integer*/
public class Rational{
	private int num, dnm; //Recommend using long for actual production
	private boolean hasZero = false;
	/**Default constructor sets the rational to 1/1*/
	public Rational(){
		setNum(1);
		setDnm(1);
	}
	/**Paramaterized constructor takes two ints, one for numerator and one for denominator
	 * then calls normalize*/
	public Rational(int n, int d){
		setNum(n);
		setDnm(d);
		normalize();
	}
	/**Method to remove duplicate negatives, or move the negative to the numerator*/
	private void normalize(){
		if(getDnm() < 0){
			if(getNum() < 0){
				setNum(Math.abs(getNum()));
				setDnm(Math.abs(getDnm()));
			}
			else{
				setNum(0 - getNum());
				setDnm(Math.abs(getDnm()));
			}
		}
	}

	/**Method to get the numerator in the rational number*/
	public int getNum(){
		return num;
	}
	/**Method to get the denominator in the rational number*/
	public int getDnm(){
		return dnm;
	}
	/**Method to set the numerator in the rational number*/
	public void setNum(int n){
		num = n;
	}
	/**Method to set the denominator in the rational number*/
	public void setDnm(int d){
		dnm = d;
	}
	/**Method to check if an Object is of the Rational class*/
	public boolean isRational(Object obj){
		if(this == obj) return true;
		if(obj == null) return false;
		if(!(obj instanceof Rational)) return false;
		return true;
	}
	/**Method to compare two rational numbers for equality*/
	public boolean equals(Object other){
		if(!isRational(other)) return false;
		Rational rat2 = (Rational) other;
		if(getNum() * rat2.getDnm() == getDnm() * rat2.getNum()) return true;
		return false;
	}
	/**Method to display the two components of a rational number as a string*/
	public String toString(){
		return "(" + getNum() + "/" + getDnm() + ")";
	}

	/**Method to add two rational numbers*/
	public void add(Rational rat2){
		setNum(getNum() * rat2.getDnm() + getDnm() * rat2.getNum()); 
		setDnm(getDnm() * rat2.getDnm());
	}
	/**Method to subtract two rational numbers*/
	public void subtract(Rational rat2){
		setNum(getNum() * rat2.getDnm() - getDnm() * rat2.getNum());
		setDnm(getDnm() * rat2.getDnm());
	}
	/**Method to multiply two rational numbers*/
	public void multiply(Rational rat2){
		setNum(getNum() * rat2.getNum());
		setDnm(getDnm() * rat2.getDnm());
	}
	/**Method to divide two rational numbers*/
	public void divide(Rational rat2){
		setNum(getNum() * rat2.getDnm());
		setDnm(getDnm() * rat2.getNum());
	}
	/**This method implements the Euclidean algorithm to find the gcd*/
	public void factor(){
		normalize();//On the chance that the neg's will disappear
		int a = Math.abs(getNum());//We're looking for common factors, so don't care about sign here
		int b = Math.abs(getDnm());
		if(b > a){ //Set a to be the larger
			int larger = b;
			b = a;
			a = larger;
		}
		while(b != 0){
			int r = a % b;
			a = b;
			b = r;
		}
		setNum(getNum() / a);
		setDnm(getDnm() / a);
	}

	public static void main(String args[]){
		printHeading();
	}
	/** This is the private helper method that displays information
	 * about the programmer, the course, and the project.
	 */
	public static void printHeading() {
		System.out.println("Alec Salazar");
		System.out.println("CMSC255-901 Spring 2014");
		System.out.println("Project 07 - Rational");
		System.out.println();
	}
}
