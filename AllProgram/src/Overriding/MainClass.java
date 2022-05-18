package Overriding;

public class MainClass {
	
	
	//Notes:- 
//			1. Method with static keyword can not override.(It will be a case of method hiding)
//			2. Method with  final keyword can not be override.
//			3. Method with private keyword can not be override.
//			4. Constructors can not be override.
//			5. Main method can not be override.

	
	public static void main(String[] args) {
		ParentClass p=new ParentClass();
		p.Property();
		p.Marrage();
		
		System.out.println("*****Child Classs******");
		
		ChildClass c=new ChildClass();
		c.Property();
		c.Marrage();
		p.Marrage();
			
		
		
		
		
	}
	
	
	

}
