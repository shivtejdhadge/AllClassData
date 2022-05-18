package Constructor;

public class Try {
	String name;
	String batch;
	double Package;
	String company;
	String date;	
	
	
	//Method Using
//	public void details(String n,String B,Double P,String C,String D){
//		name=n;
//		batch=B;
//		Package=P;
//		company=C;
//		date=D;
//		
//	}
	
	//Constructor Use
	Try(String n,String B,Double P,String C,String D){
		name=n;
		batch=B;
		Package=P;
		company=C;
		date=D;		
	}	
	public void display() {
		System.out.println("Student Name="+name);
		System.out.println("Batch No="+batch);
		System.out.println("Student Package in Lac="+Package);
		System.out.println("Student Company="+company);
		System.out.println("Student Placed Date="+date);		
	}
//public static void main(String[] args) {
//	Try Emp1=new Try("Ankit","22Jan",11.2,"IBM","22-Feb");
//	Emp1.display();
//	
//}








}//MAin Body