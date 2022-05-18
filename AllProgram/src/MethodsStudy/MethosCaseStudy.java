package MethodsStudy;

public class MethosCaseStudy {
	//Method Study-4 Case 
	
	int a=10;
	int b=20;
	
	//Case-1-Method will not accept parameter and will  not return any value.

	
	public void sum() {
		System.out.println(a+b);// not return so need println
	}
	
	//Case-2:- Method will not accept the parameter but will return the value
	
	public int case2() {
		return a+b;
	}
	
	// Case-3 Method will accept the parameter but not return the value
	
	public void case3(int a,int b) {
		System.out.println(a+b);// not return value so println req.
		
	}
		//Case 4:- Method will accept the parameter and will return the value
		
		public int case4(int a,int b) {
			return a+b;		
		}
		
	// Main mathod for call 
	public static void main(String[] args) {
		
		// Case-1 Main Call
		MethosCaseStudy cal=new MethosCaseStudy();
		cal.sum();
		//int total=cal.sum();// Not return Any value so not accept code
		
		//Case-2 Main Call
		
		MethosCaseStudy calcase2=new MethosCaseStudy();
		calcase2.case2();
		//System.out.println(calcase2.case2());
		int total=calcase2.case2();// return value so accept the code for store in another value
		System.out.println(total);
		
		// Case-3 Main Call
		
		MethosCaseStudy calcase3=new MethosCaseStudy();
		//System.out.println(calcase3.case3(20, 30));
		calcase3.case3(100, 200);// not return value so println not accept
		
		//Case-4 Main Call
		
		MethosCaseStudy calcase4=new MethosCaseStudy();
		//calcase4.case4(20,30);// Not req in Case 4
		int totalcase4=calcase4.case4(50, 30);//if total req in future
		System.out.println(calcase4.case4(20,30));//or
		System.out.println(totalcase4);//Direct
		System.out.println(calcase4.case4(20,30));//example
		
	}//Main Body	
}//Class Mody
