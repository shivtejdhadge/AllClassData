package ConditistionalStatementPratice;

public class ZomatoRatings {
	public static void main(String[] args) {
		
	int Ratings=7;
	if (Ratings==5) {
		System.out.println("Excellent");
	}else if(Ratings==4) {
		System.out.println("Good");
	}else if (Ratings==3) {
		System.out.println("Avrage");
	}else if (Ratings==2) {
		System.out.println("Bad");
	}else if (Ratings==1) {
		System.out.println("Poor");
	}else if (Ratings<1) {
		System.out.println("Lower than Range Please select Range between 1 to 5");
	}else {
		System.out.println("Out of Range Please select Range between 1 to 5");
		
	}
		
	}
		

}
