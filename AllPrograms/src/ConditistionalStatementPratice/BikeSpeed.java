package ConditistionalStatementPratice;

public class BikeSpeed {
	public static void main(String args[]) {
			
	int Speed=50;
	if (Speed<=20) {
		System.out.println("Normal Speed");
	}else if(Speed<=40) {
		System.out.println("Avrage Speed");
	}else if (Speed<=60) {
		System.out.println("High Speed");
	}else if (Speed>60) {
		System.out.println("Over Speed");	
	}

	}//main body
	

}//class body
