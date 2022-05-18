package MethodsStudy;

public class MethodsSameClass {
	
	//Method calling in Same Class
	
	

	//2 Static Method
	//2 Non static Method
	//
    //public static void main(String[] args) {
		
	
	public static void m1() {
	System.out.println("This is Static Method");
	}
	
	public static void m2() {
		System.out.println("This is static method");
	}
	
	// Non Static Method
	
	public void m3() {
		System.out.println("Thios is a non static method");
	}
	
	public void m4() {
		System.out.println("This is a Non Static Method");
	}
    
	//Create Main Method and call methods
	
	public static void main (String []args)
	{
		// Call Static 
		MethodsSameClass.m1();
		MethodsSameClass.m2();
		
		
		//Call Non Static
	MethodsSameClass obj=new MethodsSameClass();
	obj.m3();
		obj.m4();
//			
//		
}
//	
//	
//	
//	
//	
	
}
