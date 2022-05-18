package AcessModifierAndThisSuper;

public class InterfaceMainStatic implements CheckStaticInInterFace{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	public  static void m6() {
		System.out.println("static m6 from child");
		
	}
	
public static void main(String[] args) {
	
	
	InterfaceMainStatic i=new InterfaceMainStatic();
	i.m6();
	
//	InterfaceMainStatic.m6();
//	
//	CheckStaticInInterFace.m6();
}	
	

}
