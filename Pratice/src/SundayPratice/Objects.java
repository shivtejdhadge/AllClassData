package SundayPratice;

public class Objects {
	
	public static void M1(){
		System.out.println("this is static Methode M1");
	}
	public static void M2() {
		System.out.println("This is a Static M2");
		
	}
	
	public void M3() {
		//System.out.println("This is Non Staic M3");
		M1();
		M2();
		
	}
	public void M4() {
		System.out.println("this is Non-Static Methode M4");
	}
	
	public static void main(String[] args) {
		
		
		Objects o=new Objects();
		o.M3();
		
		o.M4();
		M1();
		
	}
	
	
	

}
