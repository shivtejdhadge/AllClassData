package Overloading;

public class Demo {
	
	//Overloading add multiple method in same class with same name
	//but diff arguments or diff parameter
	
	//Overload support -Return- 1st method return and next 2nd void
	//overload support -Static non static also-1st static and 2nd non static
	//only not supprt (int int) 2nd (int int) 
	
	
	public void sum(int a) {//Auto Promote Concept exapmle
		System.out.println("hi");
	}
	public void sum (int a,int b) {
		System.out.println("Overload sum with int-int="+(a+b));
	}
	
	public void sum(int a,double b) {
		System.out.println("Overload sum with int-double="+(a+b));
	}
	
	public void sum(double a,double b) {
		System.out.println("Overload sum with double-double="+(a+b));
	}
	
	public void sum(double a,int b) {
		System.out.println("Overload sum with double-int="+(a+b));
	}
	
	public static void main(String[] args) {
		
		Demo od=new Demo();
		od.sum(10, 10);
		od.sum(10, 10.1);
		od.sum(10.50, 10.50);
		od.sum(10.80, 10);
		od.sum('a');
	
		//Auto Promote Concept-if we put char it will not avaibale then it will show int 
	}
	

}
