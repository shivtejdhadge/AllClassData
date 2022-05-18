package Inheritance;

public class VehcleLoan extends Loan{
	int VType=4;
	public void VL1() {
		if(VType==2)
		System.out.println("Intrest Rate=5.9%");
	else if(VType==4)
		System.out.println("Intrest Rate =7.8%");
	else if(VType<14)
		System.out.println("Intrest Rate=9.6%");
	else 
		System.out.println("Wrong Input");
	
	}
	public void VL2() {
		System.out.println("Shooroom Coutation");
	}
	

}
