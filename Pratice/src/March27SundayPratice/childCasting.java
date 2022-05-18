package March27SundayPratice;

public class childCasting extends ParentCasting {
	
	
	public void m3() {
		System.out.println("new Methode M3");
	}
	
	public static void m1() {
		System.out.println("Methode m1 from Child");
	}
	
	public int m2(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		
		
		
		ParentCasting p=new childCasting();
		System.out.println(p.m2(10, 20));
		p.m1();
		
		
		
		
		
		
	}

}
