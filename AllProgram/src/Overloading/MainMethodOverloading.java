package Overloading;

public class MainMethodOverloading {
	
	//We can Create Main method ocerload
	
	public static void main(int a,int b) {
		System.out.println("Two int main method="+(a+b));
		
	}
	public static void main(int a,int b,int c) {
		System.out.println("Three int main method="+(a+b+c));
		
	}
	
	public static void main(double a,int b) {
		System.out.println("double and int argument="+(a+b));
	}
	
	public static void main(String[] args) {
		MainMethodOverloading mo=new MainMethodOverloading();
		//This is Static Mathod so we can Call
		//we can call-1st
		MainMethodOverloading.main(10, 0);
		//We can Call-2nd
		mo.main(10, 01, 0);
		mo.main(10.50, 10);
		//we Can call-3rd
		main(120,20);
		
		
	}
	
	
	
	

}
