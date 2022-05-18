package LoopsExample;

public class PatternNumbers {

	public static void main(String[] args) {//Pattern No.9 Numbers
//	for(int i=5;i<=5;i--) {
//		for(int j=5;j>=i;j--) {
//			System.out.print(i);
//		
//		}
//		System.out.println("");
//	}
//	
//	
	
//	for(int i=1;i<=5;i++) {// IF else Use
//		for(int j=1;j<=5;j++) {
//			if(j<5) {
//			System.out.print(i);
//		}
//		else
//		System.out.println("");
//		
//		}
//	}
//	for(int i=1;i<=4;i++) {/////// Pattern No 10
//		for(int j=1;j<=5;j++) {
//			System.out.print(j);
//		}
//		System.out.println("");
//	}
//for(int i=1;i<=4;i++) {//PATEERN nO.11
//	for(int j=1;j<=i;j++) {
//	System.out.print(i);
//		}
//	System.out.println("");
//}
//		for(int i=1;i<=5;i++)//Pattern no 12
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print(i);
//			}
//			System.out.println("");
//		}
//		
		
		
// for(int i=1;i<=5;i++)//// Try 5 Desending Prog
//		{
// for(int j=5;j>=i;j--)
//	{
//	 System.out.print(1*5);
//	}
//	System.out.println("");
////	}
//		
//	for(int i=1;i<=5;i++)// Pattern No.13
//	{
//		for(int j=5;j>=i;j--)
//		{
//			System.out.print(j);
//		}
//		System.out.println("");
//		}
//	
//		for(int i=1;i<=5;i++)// Pattern No.14
//		{
//			for(int j=5;j>=i;j--)
//			{
//				System.out.print(" ");
//		}
//		     for(int k=1;k<=i;k++) {
//		    	 System.out.print(i);
//	}
//		
//	System.out.println("");
//	
//		}
//	
		
//	for(int i=1;i<=5;i++)//Patern No.15
//	{
//		for(int j=4;j>i;j--) {
//			
//			System.out.print(" ");
//	}
//	for(int k=1;k<=i;k++)
//	{
//		System.out.print(i);
//	}
//	System.out.println("");
//}
//		
//	for (int i=1;i<=5;i++) {
//		for (int j=1;j<=i;j++) {
//			System.out.print(" ");
//		} // This for loop is to print spaces
//		for (int k=5;k>=i;k--) {
//			System.out.print(i);
//		} // This for loop is to print Number
//		System.out.println();
//	}
	
	
	for (int i=1;i<=5;i++) {////Pattern no.18

		for (int j=4;j>=i;j--) {
			System.out.print(" ");
		} // This for loop is to print spaces
		for (int k=1;k<=i;k++) {
			System.out.print(" "+i);
		} // This for loop is to print Number
		System.out.println();
	}
	
	// Program:- Pattern 19

			for (int i=1;i<=5;i++) {
				for (int j=4;j>=i;j--) {
					System.out.print(" ");
				} // This for loop is to print spaces
				for (int k=1;k<=i;k++) {
					System.out.print(k+" ");
				} // This for loop is to print Number
				System.out.println();
			}

			
//Pattern 20
			int count=0;
			for (int i=1;i<=4;i++) {
				for (int j=1;j<=i;j++) {
					count= count+1;
					System.out.print(count+ " ");
				}
				System.out.println();
			}

	
			// Program:- Pattern 21

			for (int i=1;i<=5;i++) {
				for (int j=i;j>=1;j--) {
					System.out.print(j+ " ");
				}
				System.out.println();
			}


		
	}//main

}//class
