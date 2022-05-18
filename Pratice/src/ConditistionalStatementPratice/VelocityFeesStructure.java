package ConditistionalStatementPratice;

public class VelocityFeesStructure {

	public static void main(String[] args) {
		int Fees=4500;
		String Condition="Mother/Fathr Death";
		
		if (Fees==21000) {    //Need to check condition variable with using logical Operator
			System.out.println("1st Payment Dose You can Join our Class");
		}//else if (Fees>000 || Fees>5000 ) {
			//System.out.println("Payment not fully done you are not allow to join our Class");
		else if (Condition=="Mother/Father Death") {
			System.out.println("You can Join our class Directly You have to pay only One CTC After Placed ");
		}else if (Fees==0) {
			System.out.println("Please Make 1st Payment via Below link ");
		}else {
			System.out.println("Please make Payment");
		}
		
		}
			

	}


