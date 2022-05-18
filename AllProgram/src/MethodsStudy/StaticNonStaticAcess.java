package MethodsStudy;

public class StaticNonStaticAcess {
	
	
	static int a=12;// Static Variable
	int b=10;//Non static Variable
	
	
	// Static MEthod
	public static void m1() {
		System.out.println("This a Static MEthod");
	}
	
	//Non Static MEthod
	public void m2() {
		System.out.println("This is a Non Static Mthod");
	}
	public void m3() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}
	
	
	
	//Rule-1 Static Method can Acess static members Directly (Obj creation req.)
	//In same Class
	public static void main(String[] args) {
		System.out.println(a);//only static variable not a non static 
		m1();//wihout class name we can take in same class
		
		//Rule-2-we Can call non static method in static using Object
		
		StaticNonStaticAcess obj=new StaticNonStaticAcess();
		System.out.println(obj.b);// call variable with obj
		obj.m2();
		
		System.out.println("**********Rule 3******");
		
		//Rule3-Non Static method can acess static and Non staic member directly
		StaticNonStaticAcess obj1=new StaticNonStaticAcess();
		obj1.m3();
		
		
		
		
		
	}
	
	
	
	
	
	

}
