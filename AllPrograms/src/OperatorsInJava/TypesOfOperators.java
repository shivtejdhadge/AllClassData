package OperatorsInJava;

public class TypesOfOperators {
	public static void main(String args[]) {
	int a=25;
	int b=20;
	//Arithmetic Operator---- + - * / %
	System.out.println("------------Arithmetic Operators Output---------");
	System.out.println("sum of a and b is="+(a+b));
	System.out.println("Subtraction of a and b is="+(b-a));
	System.out.println("Mlutiplication od a and b is="+(a*b));
	System.out.println("Divde a and b is="+(b/a));
	System.out.println("Module od a and b is="+(b%a));//Modulo is if we divide and remain value show
	
	//Relational Operators(Comparison Operators)---- == < > <= >= !=
	//Always give Boolean Value Output
	System.out.println("----------Relational Operators OR Comparion Operatos Outpout---------");
	System.out.println(a==b);
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a!=b);
	

	//Logical  Operators---- == && || ! 
	//Always give Boolean Value Output
	
	boolean x=true;
	boolean y=false;
	
	System.out.println("----------Logical Operatos Outpout---------");
	System.out.println("and="+(x&&y));
	
	System.out.println(y||x);
	System.out.println(!y);
	
	
	//Incriment and Decrement ---- ++ -- ! 
		//Always add +1 value and -1 Vale
	     a++;
	     a++;
	     a++;
	     ++a;
	     ++a;
	     --a;
	     --a;
	     
	     
	     int c=a+3;
	
		
		System.out.println("----------INCREMENT/DECREMENT Operatos Outpout---------");
		System.out.println(c);
		
	
	
	
	
	
	
	
	

}
}
