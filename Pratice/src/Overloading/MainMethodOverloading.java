package Overloading;

public class MainMethodOverloading {
	
	//Pratice
	
	public static void main(double a,double b) {
		System.out.println("Double Argument="+(a/b));
		
	}
	
	public static void main(double a,int b) {
		System.out.println("Double Argument="+(a/b));
		
	}
	
	public static void main(String[] args) {
		
		MainMethodOverloading mo=new MainMethodOverloading();
		mo.main(10.2, 2.3456);
		mo.main(10.39, 2);
		
		
		
		
	}
	

}
