package Constuructor;

public class StudentData {
	
	int RollNo;
	String Name;
	static String Barch="Mechsd";
	int Payment;
	static String Company="BM";
	
  public void Display() {
	  System.out.println("Roll No="+RollNo);
	  System.out.println("Name="+Name);
	  System.out.println("Brach="+Barch);
	  System.out.println("Payment="+Payment);
	  System.out.println("Company="+Company);
  }
  
  StudentData(int a,String b,int d){
	  RollNo=a;
	  Name=b;
	 // Barch=c;
	  Payment=d;
	  //Company=e;	
	}
  public void Stu(int a,String b,int d) {
	  RollNo=a;
	  Name=b;
	  Payment=d;
  }
}
