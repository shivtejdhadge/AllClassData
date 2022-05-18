package Inheritance;

public class Parents{
	int x=10;
	int y=10;
	
	public  int M1() {
		System.out.println("This is a Method M1 From Parents  Class");
		return x+y;
	}
	
	public void Display() {
		System.out.println("Return"+(x+y));
	}
	
	Parents(){
		System.out.println("Constructor");
	}
	
	
	}

