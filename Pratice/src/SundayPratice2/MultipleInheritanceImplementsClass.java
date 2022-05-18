package SundayPratice2;

public class MultipleInheritanceImplementsClass implements MultipleInheritance1,MultipleInheritance2 {

	public void MI1() {
		System.out.println(MultipleInheritance1.a);
		System.out.println(MultipleInheritance2.a);
		
	}

	public void MI2() {
	System.out.println("This is M2 Methode ");
	}

	public int MI3() {
		
		return (MultipleInheritance1.a+b);
	}

}
