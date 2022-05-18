package March27SundayPratice;

public class MIMain extends HybridClass implements IF1,IF2 {

	
	public void m3() {
		System.out.println("M3 From IF2");
		
	}


	public void m1() {
		
		System.out.println("M1 From IF1,IF2");
	}

	public int m2(int a, int b) {
		
		return a+b;
	}
	
    public static void main(String[]args) {
    	
    	MIMain m=new MIMain();
    	m.m1();
    	System.out.println(m.m2(10, 2));
    	m.m3();
    
    	System.out.println(IF1.a);
    	System.out.println(IF2.a);
    	m.m5();
    	
    	
    	
    	
    	
    }
    }