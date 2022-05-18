package CastingPratice;

public class BankMain {
	public static void main(String[] args) {
		
		BankParent p= new BankParent();
		p.CarLoan();
		p.GoldLoan();
		p.HomeLoan();
		
		System.out.println();
		BankChild c=new BankChild();
		c.CarLoan();
		c.GoldLoan();
		c.HomeLoan();
		c.PersnbalLoan();
		
		System.out.println();
		BankParent pc=new BankChild();
		pc.CarLoan();
		pc.GoldLoan();
		pc.HomeLoan();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
