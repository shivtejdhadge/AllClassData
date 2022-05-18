package MethodsStudy;

public class CallDiffClass {
	
	public static void main(String[] args) {
		
		//Method Calling  from Diff. Class
		//main method class for functional/method only.
		
		CallDiffSample.m1();
		CallDiffSample.m2();
		
		//Call Non Static by declare object 1st by s=
		CallDiffSample s=new CallDiffSample();
	        s.m4();
	        s.m3();	
	}

}
