/*
 * Alec Salazar
 * CMSC255-901
 * 2014APR17
 * Project 7 - Rational
 */

public class Rational{
	private int num, dnm;
	public Rational(){
		num = 1;
		dnm = 1;
	}
	public Rational(int n1, int n2){
		num = n1;
		dnm = n2;
		Normalize();
	}
	private void Normalize(){
		if(dnm < 0){
			if(num < 0){
				num = Math.abs(num);
				dnm = Math.abs(dnm);
			}
			else{
				num = 0 - num;
				dnm = Math.abs(dnm);
			}
		}
	}

	public int getNum(){
		return num;
	}
	public int getDnm(){
		return dnm;
	}
	public static boolean isRational(Object obj){
		if(this == obj) return true;
		if(obj == null) return false;
		if(!(obj instanceof Rational)) return false;
		return true;
	}
	public boolean equals(Object other){
		if(!isRational(other)) return false;
		Rational rat2 = (Rational) other;
		if(num * rat2.getDnm() == dnm * rat2.getNum()) return true;
		return false;
	}
	public String toString(){
		System.out.print("(" + num + "/" + dnm + ")");
	}

	public void add(Rational rat2){
		num = num * rat2.getDnm() + dnm * rat2.getNum(); 
		dnm = dnm * rat2.getDnm();
	}
	public void subtract(Rational rat2){
		num = num * rat2.getDnm() - dnm * rat2.getNum();
		dnm = dnm * rat2.getDnm();
	}
	public void multiply(Rational rat2){
		num = num * rat2.getNum();
		dnm = dnm * rat2.getDnm();
	}
	public void divide(Rational rat2){
		num = num * rat2.getDnm();
		dnm = dnm * rat2.getNum();
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
