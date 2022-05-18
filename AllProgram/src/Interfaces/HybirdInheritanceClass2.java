package Interfaces;

public class HybirdInheritanceClass2 extends HybirdInheritanceClass1 implements HybirdInheritance1,HybirdInheritance2 {

	public void m2() {
		System.out.println("This is a M2 from interface 1");
	}
	public void m3() {
		System.out.println("This is a M3 from interface 2");
	}
}
