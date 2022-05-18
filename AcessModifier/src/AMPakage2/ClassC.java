package AMPakage2;

import AMPakage1.ClassA;

//when Acess from anaother package import req 
//We can wirite * insted of ClassA for slect All

public class ClassC extends ClassA {
	//for proteected Acess need extends 
public static void main(String[] args) {
	ClassC cc=new ClassC();
	cc.protectedMethod();
	cc.publicMethod();
	
	//in other package only public and protected acess
	//public Direct
	//Protected with Inheritance
	
	
	
	
	
	
}
}
