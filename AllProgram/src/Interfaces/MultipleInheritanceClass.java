package Interfaces;

public class MultipleInheritanceClass implements MultipleInheritance1,MultipleInheritance2 {

	public void m1() {
		System.out.println(MultipleInheritance1.a);
		System.out.println(MultipleInheritance2.a);
		//call same name variable with=(Interface name.variable)
	}

	public void m2() {
		System.out.println(MultipleInheritance1.a+MultipleInheritance2.a);
		System.out.println(c);
		System.out.println(d);
		//We can access only one method but we can call any variable at any methode
	}

}
