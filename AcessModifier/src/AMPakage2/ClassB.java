package AMPakage2;

import AMPakage1.*;

public class ClassB {
	
	public static void main(String[] args) {
		
		ClassA cb=new ClassA();
		cb.publicMethod();
		//pulic acess directly in other package
		//only export req
		
		
		ClassAA caa=new ClassAA();
		caa.methodAA();
		
		
		
		
		
	}

}
