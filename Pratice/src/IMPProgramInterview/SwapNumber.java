package IMPProgramInterview;

public class SwapNumber {
	public static void main(String[] args) {
		
		//swap number
		int a=109769760;
		int b=80;
		
		
		System.out.println("a Value==>"+a);
		System.out.println("b Value==>"+b);
		
		
		System.out.println("+_++++++++++++++++++++");
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a Value==>"+a);
		System.out.println("b Value==>"+b);
		
		
		
		System.out.println("++++++++++++++++++++++++++++++By using 3rd Object++++++++++++++++++++++++");
		int c=10;
		int d=20;
	

		System.out.println();
		
		System.out.println(c);
		System.out.println(d);
		
		
		int t=c;
		c=d;
		d=t;
		
		
		System.out.println();
		System.out.println(c);
		System.out.println(d);
		
		
		
	}

}
