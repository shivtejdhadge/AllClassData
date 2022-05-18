package Methods;

import Pratice.Pratice2;

public class PraticeExamples {
	int a;
	String b;
	
	public static void M1() {
		System.out.println("This is a static method");
			}
	
	public void M2() {
		System.out.println("This is a Non static method");
		M1();
	}
	public static void main(String[]args){
		//P
		PraticeExamples.M1();
		
		//Pratice2 ob=new Pratice2();
		Pratice2.test();
		//Pratice2.test();
		
//		PraticeExamples Obj=new PraticeExamples();
//		Obj.M2();
	}
	
	
	
	

}
