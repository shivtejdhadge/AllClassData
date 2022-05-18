package Overloading;

public class ConstructorOverloading {
	
	
	ConstructorOverloading(double a,double b,double c){
		System.out.println("consructor with Double,double,double="+(a+b+c));
	}
	
	
	ConstructorOverloading(int a,int b,int c){
		System.out.println("Constructor with int,int,int="+(a+b+c));
	}
	
	ConstructorOverloading(double a,int b,int c){
		System.out.println("Constructor with double,int,int="+(a+b+c));
	}
	
	ConstructorOverloading(double a,double b,int c){
		System.out.println("Constructor with DOuble,double int");
	}
	
	ConstructorOverloading(String a,int b){
		System.out.println("String Constructor="+(a+b));
	}
	
	ConstructorOverloading(String a,String b,char c){
		System.out.println("String+String+Char="+(a+b+c));
	}
	
	
	
	public static void main(String[] args) {
		
   ConstructorOverloading co=new ConstructorOverloading(10.1,10.2,10.3);	
	ConstructorOverloading co3=new ConstructorOverloading("a","b",'c');
		
		
		
		
		
		
		
	}

}
