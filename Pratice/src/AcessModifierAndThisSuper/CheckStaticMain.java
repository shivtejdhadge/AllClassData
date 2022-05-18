package AcessModifierAndThisSuper;

public class CheckStaticMain extends CheckStatic {

	@Override
	public void M1() {
		// TODO Auto-generated method stub
		
	}
	
	public  static void m6() {
		System.out.println("static m6 from child");
		
	}
	
	
	public static void main(String[] args) {
		
		CheckStatic o= new CheckStaticMain();
		o.m6();
		
		
//		CheckStaticMain.m6();
//		CheckStatic.m6();
		
		
		
	}

	@Override
	public void m9() {
		// TODO Auto-generated method stub
		
	}

}
