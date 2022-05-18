package ConditistionalStatementPratice;

public class CovidDoseDetails {

	public static void main(String[] args) {
	int age=9;
	int Dose=1;
	if(age<=10 && Dose==2) {
		System.out.println("Childeren Allowd in Exam Hall");
	}else if(age<=10 && Dose<=1){
		System.out.println("As per Goverment Guideline You are Not allow to Enter");
	}else if(age>=18 && Dose==2) {
		System.out.println("You can Enter in Exam hall");
	}else if (age<=18 && Dose<2) {
		System.out.println("Need RTPCR-Negative Test to Enter in Exam Hall");
		
	}else if (age>=25 || Dose<=2) {
	System.out.println("Using With Proper PPE kit You can Enter in Exam Hall ");
		
	}
		
		
	}

	}


