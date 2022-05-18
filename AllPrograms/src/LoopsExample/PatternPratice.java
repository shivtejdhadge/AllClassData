package LoopsExample;

public class PatternPratice {

	public static void main(String[] args) {
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {     //1st Pattern
//			System.out.print("*");	
//			}
//			System.out.println("");
//		}
////		
//		
//		for(int i=1;i<=4;i++) 
//			{for(int j=1;j<=i;j++) //   2nd Pattern
//			{System.out.print("*");	
//			
//			}
//				System.out.println("");
//		}
//			
//		
//		for(int i=1;i<=5;i++) {
//			for(int j=5;j>=i;j--) {
//				System.out.print("*");//2nd and 3rd Pattern Add
//			}
//			System.out.println("");
//		}
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
			System.out.print("*");
		}
		System.out.println("");
		
	}

	}//main

}//class
