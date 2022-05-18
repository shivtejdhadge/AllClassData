package ConditistionalStatementPratice;

public class DateOfWeek {
public static void main(String args[]) {
	int date=50;
	if (date<=6) {
		System.out.println("1st Week of the Month");
	}else if (date<=13) {
		System.out.println("2nd week of month");
	}else if (date<=20) {
		System.out.println("3rd Week of Month");
	}else if(date<=28) {
		System.out.println("4th week of Month");
	}else if (date>28) {
		System.out.println("Wrong date Please Check and try again");
	}
	
   
}
}
