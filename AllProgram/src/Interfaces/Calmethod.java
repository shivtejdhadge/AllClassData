package Interfaces;

public class Calmethod implements Calculator {

	public int sum(int a, int b) {
		System.out.println(a+b);
		return a+
				b;
	}
	public int diff(int a, int b) {
		return a-b;
	}
	public int mul(int a, int b) {
		return a*b;
	}
	
	public  int divide(int a, int b) {
		return a/b;
	}
	

}
