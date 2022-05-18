package Overloading;

public class Loan {
	
	public void BankLoan(int a) {
		System.out.println("Bike Loan 12 Month ="+(700*12+a));
	}
	
	
	public static void main(String[] args) {
		Loan l=new Loan();
		
	l.BankLoan(10000);
		
		
		
		
	}
}
