package ConditistionalStatementPratice;

public class EMIPayment {

	public static void main(String[] args) {
	int Date=13;
	if (Date<=7) {
			System.out.println("EMI Week No Extra Cost");
	}else if(Date<=14) {
			System.out.println("EMI EXTRA FINE-100RS");
	}else if(Date<=21) {
		System.out.println("EMI EXTRA FINE-200RS");
	}else if (Date<=28) {
		System.out.println("EMI EXTRA FINE-300RS");
	}else if(Date<=31) {
		System.out.println("EMI EXTRA FINE-400RS");
	}else if(Date>=32) {
		System.out.println("Date Wrong");
		
		
	}

	}

}
