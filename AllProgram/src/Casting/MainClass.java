package Casting;

public class MainClass {
	public static void main(String[] args) {
		
		FatherClassNonPrimitiveCasting f= new FatherClassNonPrimitiveCasting();
		
		f.Car();
		f.Money();
		f.Home();
		
		System.out.println("****Child****");
		ChildClass c= new ChildClass();
		c.Car();
		c.Money();
		c.Home();
		c.Bike();
		
		System.out.println("********UpCasting*********");
		FatherClassNonPrimitiveCasting fup=new ChildClass();
		//Upcasting
		//New methode of child NA
		fup.Car();
		fup.Home();
		fup.Money();
		
		System.out.println("********UpCasting*********");
		
		//ChildClass cdc=new FatherClassNonPrimitiveCasting();
		
		//Not spport because we cant go back child to father
		
		
		
		
		
		
		
		
	}

}
