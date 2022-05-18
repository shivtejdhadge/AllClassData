package LoopsExample;

public class PatternProgramming {       //5Star Patter

	public static void main(String[] args) {
//		for(int i=1;i<=5;i++){
//			for(int j=1;j<=5;j++) {
//				System.out.print("*");
//			}//inner body
//			System.out.println("");
//		}//outer body
		
	    /// Decending star
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("" );
//		}
	//
		for (int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
	}//Main body

}//classbody


