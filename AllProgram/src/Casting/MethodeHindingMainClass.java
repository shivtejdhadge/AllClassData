package Casting;

public class MethodeHindingMainClass {
	public static void main(String[] args) {
		
		MethodHidingParentClass p=new MethodHidingParentClass();
		p.m1();
		p.m2();
		
		System.out.println("******Child Class******");
		
		MethodeHidingChild c=new MethodeHidingChild();
		c.m1();
		c.m2();
		
		
		//Upcasting Object
//		System.out.println("*******Upcasting*******");
//		MethodHidingParentClass pc=new MethodeHidingChild();
//		pc.m1();
//		pc.m2();
//		
//		
		
		
		
		
		
		
		
	}

}
