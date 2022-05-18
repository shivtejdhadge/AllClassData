package March27SundayPratice;

public class Overloading {

	
	public int m1(int a,int b) {
		return a+b;
	}
	
	public int m1(int a,int b,int c) {
		return a+b+c;
	}
	
	public double m1(double a,int b,int c) {
		return a+b+c;
	}
	
	
	
	public static void main(String[] args) {
	
		Overloading o=new Overloading();
		System.out.println(o.m1(10, 20));
		o.m1(1, 20, 20);
		o.m1(100, 200);
		
	
	

}
}
