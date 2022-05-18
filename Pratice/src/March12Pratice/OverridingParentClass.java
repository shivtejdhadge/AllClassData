package March12Pratice;

public class OverridingParentClass {
	
	public void BankLoan(int a) {
		System.out.println("Persnal Loan Instrest="+(a*0.05));
	}
	
	public void Bank(int a,int b) {
		System.out.println("Home Loan Intrest="+(a));
	}
	
	public  void Bank(int  a) {
		System.out.println("Credit card with 50K limit");
	}
	
	public void Bank(String a,String b) {
		System.out.println("Mannual");
	}
	
	

}
