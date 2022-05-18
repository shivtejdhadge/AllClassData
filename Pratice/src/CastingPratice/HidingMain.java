package CastingPratice;

public class HidingMain {
	public static void main(String[] args) {
		
		HidingParent p=new HidingParent();
		System.out.println(p.m1(10, 20));
		System.out.println(p.m2(10, 20));
		
		System.out.println("Child");
		
		HidingClass c=new HidingClass();
		System.out.println(c.m1(10, 20));
		System.out.println(c.m2(10, 20));
		
		System.out.println("Hiding");
		
		HidingParent hp=new HidingClass();
		System.out.println(hp.m1(10, 20));
		System.out.println(hp.m2(10, 20));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
