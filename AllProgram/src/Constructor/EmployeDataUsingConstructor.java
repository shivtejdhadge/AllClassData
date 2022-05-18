package Constructor;

public class EmployeDataUsingConstructor {
	String name;
    String batch;
	double Package;
	String company;
	String date;
	EmployeDataUsingConstructor(String n,String b,double P,String c,String d){
	name=n;
	batch=b;
	Package=P;
	company=c;
	date=d;
	}
	public void display() {
		System.out.println("Student Name="+name);
		System.out.println("Student batch="+batch);
		System.out.println("Student Package="+Package);
		System.out.println("Student company="+company);
		System.out.println("Student date="+date);	
	}
	
	
	
	
	
	

}
