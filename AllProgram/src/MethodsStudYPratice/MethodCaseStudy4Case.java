package MethodsStudYPratice;

public class MethodCaseStudy4Case {
	int a=100;
	int b=200;
	//Case-1 Method Not Accept the parameter valuve and not return anything
   public void Sum() {
	   //void-not return
	   //sum()-no parameter
	System.out.println(a+b);//no return but req for check output
}
   //Case-2-no para and return value
   public int sum1() {
	   return (a-b);
   }
   
   
   //Case 3- accept para and not return value
   public void sum3(int x,int y) {
	   System.out.println(x-y);//For check output
	   
   }
   
   //Case-4 Accept Para and return value
   public int sum4(int c,int d) {
	   return (c+d);
   }

public static void main(String[] args) {
	//Case-1 Output
	System.out.println("Case-1 Output");
	MethodCaseStudy4Case obj= new MethodCaseStudy4Case();
	obj.Sum();
	
	//Case-2 Output
	System.out.println("Case-2 output");
	MethodCaseStudy4Case obj2=new MethodCaseStudy4Case();
	obj2.sum1();
	System.out.println(obj2.sum1());
	
	
	//Case 3 Output
	System.out.println("Case 3 Output");
	MethodCaseStudy4Case obj3=new MethodCaseStudy4Case();
	obj3.sum3(122, 2);
	
	
	
	
	
	
	//Case-4 Output
	System.out.println("Case-4 output");
	MethodCaseStudy4Case obj1=new MethodCaseStudy4Case();
	System.out.println(obj1.sum4(300,100));
	
	
	
	
	
}
}
