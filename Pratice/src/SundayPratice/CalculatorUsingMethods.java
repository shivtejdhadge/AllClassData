package SundayPratice;

public class CalculatorUsingMethods {
	
	public int Sum(int a,int b) {
		return a+b;	
	}
	public int sub(int a,int b) {
		return a-b;
		
	}
	public double div(double a,double b) {
		return a/b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int modulo(int a,int b) {
		return a%b;
	}
	
	
	public static void main(String[] args) {
		
		CalculatorUsingMethods sum=new CalculatorUsingMethods();
        System.out.println("Sum="+sum.Sum(2, 4));
		System.out.println("Sub="+sum.sub(10, 5));
		System.out.println("Mul="+sum.mul(10, 3));
		System.out.println("Divide="+sum.div(10, 3));
		System.out.println("modulo="+sum.modulo(8, 8));
		
	}
	
	
	
	
	
	

}
