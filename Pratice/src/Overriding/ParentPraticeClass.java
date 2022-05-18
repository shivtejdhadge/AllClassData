package Overriding;

public class ParentPraticeClass {
	
	//Private not accept bcz not extends other class
	private void CompanyCar() {
		System.out.println("Company Provide Car for Pick And Drop ");
	}
	
	//it will accept but it is method hiding concept
	//bcz its common for all thats why we can't change into child 
  //we can chnage direct from parent class
	public static void CompayHouse() {
		System.out.println("Company Provide Flat for Stay");
	}

	
	//Final not Aceept at Child class
	public final int CompanyWifiAllowns() {
		return 1000;
	}
	
	
//	public void CompanyWorkingHour() {
//		System.out.println("Working hour is 12 Hours 8 AM to 8 PM");
//	}
	
	//Constructor not Accept
	ParentPraticeClass(){
		System.out.println("Constructor at");
        }
	
	
	
	
	
	
	
}
