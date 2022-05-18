package AMPakage1;

public class ClassAA {
	
	public static void main(String[] args) {
		
		ClassA caa=new ClassA();
		caa.protectedMethod();
		caa.publicMethod();
		caa.defaultMethod();
	//we can Acess-public,default,protected in same package only
		//not private
		
		
	}
	public void methodAA() {
		System.out.println("Method Class AA");
	}

}
