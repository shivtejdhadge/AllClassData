package SundayPratice2;

public class Constructor2{
	
	double Income;
	

	Constructor2(double a){
		Income=a;
		//
	}
	
	public void Tax5() {
		System.out.println("5% Tax yearly Pay Amount to Gov ="+(Income*0.05));	
	}

	public void Tax10() {
		System.out.println("10% Tax yearly Pay Amount to Gov ="+(Income*0.10));	
	}
	
	public void Tax15() {
		System.out.println("15% Tax yearly Pay Amount to Gov ="+(Income*0.15));	
	}
	
	public void Tax25() {
		System.out.println("25% Tax yearly Pay Amount to Gov ="+(Income*0.25));	
	}
	public void Tax30() {
		System.out.println("30% Tax yearly Pay Amount to Gov ="+(Income*0.030));	
	}
	
	
	
	
	
	
	
	

}
