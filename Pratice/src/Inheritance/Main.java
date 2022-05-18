package Inheritance;

public class Main {
	public static void main(String[] args) {
		Parent P=new Parent();//Only Parent
		P.M1();
		Grandson G=new Grandson();//All Parent Child Grandson
		G.M3();
		Child C=new Child();//Parent And Child
		C.M2();

	}

}
