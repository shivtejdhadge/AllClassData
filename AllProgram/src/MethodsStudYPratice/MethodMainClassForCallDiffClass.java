package MethodsStudYPratice;

public class MethodMainClassForCallDiffClass {
	public static void main(String[] args) {
		
		MethodGenericClassForCallDiffMethod object=new MethodGenericClassForCallDiffMethod();
		object.M2();
		
		MethodGenericClassForCallDiffMethod.M1();//Req class name generic class for run
		//M1(); we cant call direct because diff class
		
	}

}
