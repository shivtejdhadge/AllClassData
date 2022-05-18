package March12Pratice;

public class OverridingChildClass extends OverridingParentClass{
	

	public void Bank(int a) {
		System.out.println("Credit card not Req");
	}
	
	
	
	
	
public static void main(String[] args) {
	
	OverridingChildClass OR=new OverridingChildClass();
	//OR.Bank();
	OR.Bank(1);
	
	
	
}
}
