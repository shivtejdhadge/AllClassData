package Overriding;

public class ChildePraticeClass extends ParentPraticeClass {
	
	private void CompanyCar() {
		System.out.println("Company Provide Car for Pick And Drop at ay ");
	}
	
	public void CompanyWorkingHour() {
		System.out.println("Working hour is 8 Hours 10 AM to 6 PM");
	}
	
//	public static void CompayHouse() {
//		System.out.println("Company Provide Flat for Stay but i have a own house");
//	}
	
	//Not allow bcz final key word use
//	public final int CompanyWifiAllowns() {
//		return 1500;
//	}
	
	
	//COnstructor Not Accept
//	ParentPraticeClass(){
//		System.out.println("Constructor at");
//	}
	

}
