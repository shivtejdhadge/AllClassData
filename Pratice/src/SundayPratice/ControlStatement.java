package SundayPratice;

public class ControlStatement {
	public static void main(String[] args) {
		int a=-1;
		
		System.out.println("****Positve/Negative Number****");
		
		if(a>0) {
			System.out.println("Positive Number");
		}else if(a<0){
			System.out.println("Negative Number");
		}else {
			System.out.println("Zero number");
		}
		System.out.println();
		System.out.println("****Even OR Odd Number*****");
		
		int b=24251654;
		
		if(b%2==0) {
			System.out.println("Even Number");
		}else{
			System.out.println("ODD Number");
		}
		
		
		System.out.println();
		System.out.println("******FB Login****");
		
		int age=12
				;
		
		if(age>=18) {
			System.out.println("User allow to Enter");
		}else {
			System.out.println("User Not Allow");
			
		}
		System.out.println();
	System.out.println("*****Covid Dose******");
	     
	          int Age=26;
	          int Dose=1;
	          
	          if(Age<18 &&Dose==2) {
	        	  System.out.println("You are Safe You Can Enter In Exam Hall ");
	          }else if(Age<18 && Dose<=1) {
	        	  System.out.println("Plase Complte your Vaccination");
	          }else if(Age>18 && Dose==2) {
	        	  System.out.println("18++ And Both Dose Done You Are Safe Yo Can Enter");
	          }else if (Age>18 && Dose<=1) {
	        	  System.out.println("18++ But Both Dose Not done Please wear a PPE");
	          }
	          
	          
	          
	
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
