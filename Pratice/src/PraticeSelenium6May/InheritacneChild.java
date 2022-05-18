package PraticeSelenium6May;

public class InheritacneChild extends InheritanceParentClass2{
	
	public static void m3() {
		System.out.println("M3 class 2");
	}
	
	
public static void main(String[] args) {
	
	
	InheritanceP c=new InheritanceP();
	c.m1();
	c.m2();
	InheritacneChild p=new InheritacneChild();
//	p.m1();
//	p.m2();
//	p.m3();
	
}
}