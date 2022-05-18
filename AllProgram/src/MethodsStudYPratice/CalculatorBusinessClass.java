package MethodsStudYPratice;

public class CalculatorBusinessClass {
	
	public int getsum(int a,int b) {
		return a+b;
	}

	public int getsub(int b,int a) {
		return(b-a);
		
	}
	public int getmul(int a,int b) {
		return a*b;
		
	}
	public double getdivide(double b,double a)
	{
		return b/a;
	}
	
	public int getthereemul(int a,int b,int c) {
		return a*b+c;
	}
	
	public static void main(String[] args) {
		CalculatorBusinessClass obj=new CalculatorBusinessClass();
		
		
		
		System.out.println("sum ofa+b="+obj.getsum(20, 30));
		System.out.println("Subtraction="+obj.getsub(30, 20));
		System.out.println("Multiply="+obj.getmul(20, 30));
		System.out.println("Divide"+obj.getdivide(763, 6));
		System.out.println("three sum="+obj.getthereemul(2, 3, 3));
		
		
	}
 
	
	
	
}
      







