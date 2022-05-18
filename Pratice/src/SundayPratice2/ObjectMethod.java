package SundayPratice2;

public class ObjectMethod {
	
	protected int m1(int a,int b) {
		return a+b;	
	}
	public int m2(int a,int b) {
		return a-b;
	}
	
	protected void m3(int a,int b){
		System.out.println("this m3 Protectred");
	}
	
	public void m4() {
		System.out.println("this m4 public ");
		M5(2,3);
	}
	
	public static  void M5(int a,int b) {
		System.out.println("this is static M5 non return="+(a-b));
		
	}
	
	public static void main(String[] args) {
		
		ObjectMethod m=new ObjectMethod();
		System.out.println(m.m1(10,10));
		m.m4();
		M5(10,5);
		
	}
	
	
	
	
	}
