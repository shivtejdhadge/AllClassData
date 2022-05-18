package MethodsStudYPratice;

public class EmployeeData {
	
	String name;
	static String Batch="22Jan";
	double Package;
	String company;
	String Date;
	
	public void display() {
		System.out.println("Student Name="+name);
		System.out.println("Batch No="+Batch);
		System.out.println("Student Package in Lac="+Package);
		System.out.println("Student Company="+company);
		System.out.println("Student Placed Date="+Date);		
	}
	
	public static void main(String[] args) {
		
		System.out.println("****Student 1*****");
		
		EmployeeData student1=new EmployeeData();
		student1.name="Ankit";
		student1.Batch="22Jan";
		student1.Package=11.2;
		student1.company="IBM";
		student1.Date="22-Feb-2022";
		student1.display();
		System.out.println();
		System.out.println("*****Student 2*******");
		
		EmployeeData student2=new EmployeeData();
		student2.name="Rajesh";
		//student2.Batch="23Jan";
		student2.Package=9.2;
		student2.company="QK";
		student2.Date="12-Feb-2022";
		student2.display();
		
		System.out.println();
		System.out.println("*****Student 3******");
		EmployeeData student3=new EmployeeData();
		student3.name="Sachin";
		//student3.Batch="22Jan";
		student3.Package=6.2;
		student3.company="Tech Mahindra";
		student3.Date="4-March-2022";
		student3.display();
		
		System.out.println();
		System.out.println("******Student 4********");
		EmployeeData student4=new EmployeeData();
		student4.name="Manish";
		//student4.Batch="22Jan";
		student4.Package=8.2;
		student4.company="TCL";
		student4.Date="30-April-2022";
		student4.display();
		
	}
	
	

}
