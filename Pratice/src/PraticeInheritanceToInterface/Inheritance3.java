package PraticeInheritanceToInterface;

public class Inheritance3 extends Inheritance2 {
	
	public void m3() {
		System.out.println("This is M3-C3");
	}
	public static void main(String[] args) {
		
		Inheritance3 ih=new Inheritance3();
		ih.m1();
		ih.m2();
		ih.m3();
		
	}

}
