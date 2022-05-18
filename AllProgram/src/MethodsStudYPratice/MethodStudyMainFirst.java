package MethodsStudYPratice;

public class MethodStudyMainFirst {
	//Regural and main Method 
	//Regular it has two type 1.Static And Non Static 
	
	//Static Method-
	public static void Test1() {
		System.out.println("This is a static Method");
		//Becuase its conatin static word 
		//Void mence no return
	}
		
	//Non Staic Method not contain static word
		public void Test2(){
			System.out.println("This is a Non Static Method");
		}
	public static void main(String[] args) {
		//Main method Imp to Call 
		
		Test1();//Direcet method 
		MethodStudyMainFirst.Test1();//call class name 
		
		MethodStudyMainFirst s=new MethodStudyMainFirst();//Create object
		s.Test2();//Call Object
	}
		
		
		
		
		
	}

	
	
	
	
	
	


