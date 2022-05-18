package PraticeInheritanceToInterface;

public class Inheritance2 extends Inheritance  {
	
	int a=20;
	//Override not allow it will print latest value
	
	public void m2() {
		System.out.println("this m2-c2");
		m1();// we can direct call m1
	}
	
public static void main(String[] args) {
	
	Inheritance2 i=new Inheritance2();
	i.m2();
	System.out.println(i.a);
	
}
}
