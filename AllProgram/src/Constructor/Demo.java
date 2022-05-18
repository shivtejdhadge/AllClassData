package Constructor;

public class Demo {
	int a;
	String b;
	//Declare
	
	Demo(){
		System.out.println("Constructor");
	}
	
	//Constructor with argument/Paramater
//	Demo(int c,String d){
//	a=c;
//	b=d;
//}
//	
	//Using Method
 public void M1(int s,String d ) {
	 a=s;
	 b=d; 
 }

	public void Display() {//For Print Data
		
		System.out.println("Student Rool No="+a);
		System.out.println("Student Name="+b);
	}

}
