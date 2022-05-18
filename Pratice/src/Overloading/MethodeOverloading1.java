package Overloading;

public class MethodeOverloading1 {
	
	
	public static void mul() {
		System.out.println("Overloading with multiply Zero Argument");
	}
	
	protected final void mul(int a,int b) {
		System.out.println("Overloading with multiply int Argument="+(a*b));
	}
	
	 double mul(double a,double b) {
		 return a*b;
	 }
	 
	
	 private double mul(int a,double b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		mul();
		MethodeOverloading1 mo=new MethodeOverloading1();
		System.out.println("multiply Overloading with Return,private int-double Argument="+mo.mul(10, 10.2));
		mo.mul();
		mo.mul(10, 20);
		System.out.println("Return double-double"+mo.mul(10, 10.2));
	
	}
	
	
	

}
