package AcessModifierAndThisSuper;

public abstract  class CheckStatic {
	
	
	public abstract void M1();
	public static void m2() {
		System.out.println("Implemented");
	}
	
	//public abstract  final void m3();==> final abstract not allow
	
	//public abstract static void m4();  ==>static absrtact not allow
	
	public  static void m6() {
		System.out.println("static m6 from parent");
		
	}
	
	public abstract void m9();
	
	public  CheckStatic() {
		System.out.println("constror");
	}
	
//aloow but not a abstrcat 
}
