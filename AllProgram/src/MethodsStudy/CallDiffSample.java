package MethodsStudy;

public class CallDiffSample {
	
	//business logic class
	
	//2 static method
	//2 non static method
	
	public static void m1() {
		
		System.out.println("This is a Static Methode M1");
	}
	
	public static void m2() {
		
		System.out.println("This is a Static Method M2");
	}
	
	//Non Static Method 
	
	public void m3() {
		System.out.println("This is a Non-static Method m3");
	}
	public void m4() {
		System.out.println("This is a Non-Static Method m4");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Start Here");
		
		//Call Static Method
		CallDiffSample.m1();
		
		
		CallDiffSample.m2();
		
		//Call Non Static Method
		CallDiffSample obj=new CallDiffSample();
		obj.m3();
		obj.m4();
		
	}
	
	
	
	

}
