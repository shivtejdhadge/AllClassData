package MethodsStudy;

public class CalculatorUsingCase4 {
	
	//Calculator-using Case 4 bcz we req return over parameter
	//
		
	//Addition:+
	public int getsum(int a,int b) {
		return a+b;
		}
	//Subtraction
	public int getsubtraction(int a,int b) {
		return a-b;
	}
	
		//Multiplication
		public int getmultiplication(int a,int b) {
			return a*b;
		}
		
		//Divide
		public double getdivide(int c,int d) {
			return c/d;
		}
		public int getthreesum(int a,int b,int c) {
		 return a+b+c;
		}
        
		//Main body-is print ln bcz Case 4is return 
	
	public static void main(String[] args) {
		CalculatorUsingCase4 cal=new CalculatorUsingCase4();
		System.out.println(cal.getsum(10,20));
		System.out.println(cal.getsubtraction(10,5));
		System.out.println(cal.getmultiplication(10,10));
		System.out.println(cal.getdivide(10,3));// Req double ??
		System.out.println("three sum="+cal.getthreesum(1, 1, 1));//Print input value??
         
		
	}//Class Body
}//Main Body
