package SundayPratice2;

public class ConditionalStatement {
	
//IF Else-Income Tax
	
	public static void main(String[] args) {
		
		double Income=45;//In Lac
		
		if(Income<=2.5){
			System.out.println("No Tax");		
		}else if(Income<5) {
			System.out.println("5% Income Tax");
		}else if(Income<7.5) {
			System.out.println("10% Income Tax");
		}else if(Income<10) {
			System.out.println("15% Incomne Tax");
		}else if(Income<12.5) {
			System.out.println("20% Income Tax");
		}else if (Income<15) {
			System.out.println("25% Income Tax");
		}else if(Income>=15) {
			System.out.println("30% Income Tax");
		}else {
			System.out.println("Wrong Input");
		}
		
		
		
		
		
		
	}

}
