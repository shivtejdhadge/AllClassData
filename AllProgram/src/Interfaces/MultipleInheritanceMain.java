package Interfaces;

public class MultipleInheritanceMain {
	public static void main(String[] args) {
		int a=40;
		MultipleInheritanceClass mi=new MultipleInheritanceClass();
		mi.m1();
		mi.m2();
		
		System.out.println(a);
		//it will take local variable for print
		System.out.println(MultipleInheritance1.a);
		//Call interface class variable
		
	}

}
