package ConditistionalStatementPratice;

public class TimingOfDay {
	public static void main(String[] args) {
		double Time=11.67;
		if (Time<=11.59) {
			System.out.println("Good Moring");
		}else if (Time<=17) {
			System.out.println("Good Afternoon");
		}else if(Time<=23.59) {
			System.out.println("Good Evining");
		}else if(Time>=24) {
		System.out.println("Please Insert Correct time");
			
		}else {
			System.out.println("Good Night");
		}
	}

}
