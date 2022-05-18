package Inheritance;

public class Gradson extends Child{
	
public static void main(String[] args) {
	
	//Multilevel Inheritacnce Parents ,Child,Gradson  
	
	//Gradson with child aquire all parents and child property
	Gradson g1=new Gradson();
	g1.M1();
	g1.Display();
	g1.M2();
	
	Parents P=new Parents();
			//if we call Parent only parent method call
			P.M1();
	
			
			
}
	
	
}
