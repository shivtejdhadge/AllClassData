package Inheritance;

public class HomeLoan extends Loan{
	int Flat=3;
	
	public void HL1() {
		System.out.println("Custemer Home Details");
			}	
	public void HL2() {
		
		if(Flat==1) {
		System.out.println("Custemer Nominee 1 Req");
		} else if(Flat<=0)
			System.out.println("Please Enter valid Flat details");
	      else if(Flat>1) {
		System.out.println("Req. 4 Nos of Nomeinee");
		

}
}
}