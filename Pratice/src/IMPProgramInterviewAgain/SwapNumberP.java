package IMPProgramInterviewAgain;

public class SwapNumberP {
	
	public static void main(String[] args) {
		
	
	int a=3;
	int b=1;
	
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
	
//By using 3rd Variable
	int c=a;
	a=b;
	b=c;
	System.out.println(a);
	System.out.println(b);
	
	
	
	
	
}
}