package Methods;

public class StudentMain {
	public static void main(String[] args) {
		StudentData St1=new StudentData();
		St1.RollNo=1;
		St1.Name="Rajesh";
		//St1.Branch="";
		St1.Company="STT";
		St1.Salary=40000;
		St1.Display();
		System.out.println("****Student No.2 Data*********");
		
	StudentData St2=new StudentData();
	//St2.Branch="Mech";
	St2.Company="Tenon";
	St2.Name="Vaibhav";
	St2.RollNo=2;
	St2.Salary=25000;
	St2.Display();
	}

}
