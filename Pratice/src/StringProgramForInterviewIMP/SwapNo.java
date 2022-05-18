package StringProgramForInterviewIMP;

public class SwapNo {
	public static void main(String[] args) {
		
	int a=10;
	int b=30;
	
		a=a+b;
		b=a-b;
		a=a-b;
	
	System.out.println(a);
	System.out.println(b);
	
	
	
	System.out.println("****************************   3rd USe ********************");
	
	int c=a;
	a=b;
	b=c;
	
	System.out.println(a);
	System.out.println(b);
	
	
	
	
	}
}
