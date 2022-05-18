package Overriding;

public class BankMain {
	
	public static void main(String[] args) {
		
	
	RBI r=new RBI();
	System.out.println(r.RateofInstrest());
	HDFC h=new HDFC();
	System.out.println(h.RateofInstrest());
	SBI s=new SBI();
	System.out.println(s.RateofInstrest());
	ICICI i=new ICICI();
	System.out.println(i.RateofInstrest());

	
	
	}
}
