package March12Pratice;

public class Overloading {
	public void M1(String a,String b) {
		System.out.println("This is M1-String-String="+(a+b));
	}
	public void M1(int a,int b) {
		System.out.println("This is M1-int-int="+(a/b));
	}
	public void M1(String a,int b) {
		System.out.println("This is M1-String int"+(a+b));
	}
	public void M1(int a,String b) {
		System.out.println("This is M1-int,String="+(a+b));
	}
	public void M1(int a,double b) {
		System.out.println(a+b);;
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		o.M1(1, 10);
		
	}
}
