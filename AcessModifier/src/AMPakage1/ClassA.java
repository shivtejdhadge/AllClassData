package AMPakage1;

public class ClassA {
	
	public int publicvariable=1;
	int defaultvariable=2;
	//private int privatevariable=3;
	protected int protectedvariable=4;
	
	
	public static void main(String[] args) {
		
		ClassA ca=new ClassA();
		ca.privateMethod();
		ca.publicMethod();
		ca.defaultMethod();
		ca.protectedMethod();
		//All acessible in same class
		
		
		
		
		
		
		
	}

    
	public void publicMethod() {
    	System.out.println("public Method");
    	
    }
    void defaultMethod() {
    	System.out.println("Default Method");
    }
    
    private void privateMethod(){
    	System.out.println("PrivateMethod");
    }
    
    protected void protectedMethod() {
    	System.out.println("Peotected Method");
    }
	
	
	public void display() {
		
		
		
		
	}
	
	
	
	
	

	
	
}
