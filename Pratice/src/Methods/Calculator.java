package Methods;

public class Calculator {
	double a=11.44;
	int b=20;
	
	public double Add() {
	return a+b;
	}
	public int Sub(int a,int b) {
		return a-b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	public double Divide(double a,double b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculator S=new Calculator();
		System.out.println("Sum="+S.Add());
		System.out.println("SuB="+S.Sub(20,10));
		System.out.println("Multi="+S.mul(10, 5));
		System.out.println("Divide="+S.Divide(10,4));
	}

}
