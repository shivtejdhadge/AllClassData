package Overloading;

public class DemoConstructor {
	
	//Constructor OVERLOADING 
	DemoConstructor(){
		System.out.println("Constructor with Zero Arguments");
	}
	DemoConstructor(int a,int b){
		System.out.println("Constructor with argument-int int="+(a+b));
	}
	
	DemoConstructor(double a,int b){
		System.out.println("Constructor with argument-double-int="+(a+b));
	}
	
	
	void m1() {
		System.out.println("try Methode in Constructor");
		}
	
	public static void main(String[] args) {
		
		DemoConstructor co=new DemoConstructor();
		co.m1();
		
		DemoConstructor co1=new DemoConstructor(1,2);
		
		DemoConstructor co2=new DemoConstructor(1.5,2);
		
		
		
		
	}
	

}
