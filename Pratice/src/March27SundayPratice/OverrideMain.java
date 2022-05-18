package March27SundayPratice;

public class OverrideMain extends OverridingPratice {
	
	public int m1(int a,int b) {
		return a/b;
	}
	public void OverridingPratice(){
		System.out.println("Class name With void");
	}
	public static double m5(double a,double b) {
		return a*b;
	}
	
	public void m1() {
		System.out.println("2nd");
	}
	public int m2(int a,int b) {
		return a+b;
	}
	
	public void m3() {
		System.out.println("new M3 Methode child");
	}

public static void main(String[] args) {
	
	
	OverrideMain c=new OverrideMain();
	
	c.m1();
	System.out.println("Methode From Child="+c.m2(10, 20));
	
	c.m3();
	c.m1();
	System.out.println(c.m5(10, 20));
	System.out.println("PArent ");
	OverridingPratice p=new OverridingPratice();
	p.m1();
	System.out.println("Methode From Parent="+p.m2(10, 20));
     System.out.println( p.m5(10, 20));   
}
}
