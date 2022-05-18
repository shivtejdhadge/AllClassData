package MethodsStudYPratice;

public class StaticNonStaicWordUse {
	
	//Static 
	public static void M1() {
		System.out.println("This is Static M1");
	M2();
	}
	//static 2
	public static void M2() {
		System.out.println("This is Static M2");

		
	}
	//Non-Static3
	public  void M3() {
		//System.out.println("This is Non Static M3");
         M1();
		M4();
	}
	//NonSaticM4
public void M4() {
	System.out.println("This is Non Static M4");

	
}

public static void main(String[] args) {
//	StaticNonStaicWordUse.M1();
//M1();
	
  StaticNonStaicWordUse obj1=new StaticNonStaicWordUse();
//	obj1.M3();
	
	obj1.M4();
	
	
}





}
