package MethodsStudYPratice;

public class CaseStudyPratice {
	int a=2;
	int b=5;
	
	
	
	//Case-1-No parametr no return
	public void case1() {
		System.out.println(a*b);
	}//case 1 end
	
	//Case 2-no para return value
	
	public double case2() {
		return b/a;//end with return
	}
	
	//Case-3 acess para no return
	
public void case3(int a,int b) {
	System.out.println(b-a);	
}//Case 3 end

public int Case4(int a,int b ) {
	return  a+ b;
			
	
}

	
	
	
	
	public static void main(String[] args) {
		CaseStudyPratice obj=new CaseStudyPratice();
		obj.case1();
		
		System.out.println(obj.case2());
		
         obj.case3(2, 2);
         System.out.println(obj.Case4(2, 9));
		
		
         
         
         
         
         
	}
	
}


