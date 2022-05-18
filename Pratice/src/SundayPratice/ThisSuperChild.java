package SundayPratice;

public class ThisSuperChild extends ThisSuper {
	
        int a=10;
	public void test() {
		int a=20;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		ThisSuperChild o=new ThisSuperChild();
		o.test();
	
	}	
}