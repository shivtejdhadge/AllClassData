package MethodsStudy;

public class EmployeeSameDepartmentProgram {
	
	int empid;
	String empname;
     int empdept=3;//if we want all empdept same
	 // we can direct use int emp dept=3 but if we req to change from no.4 to forward 
    //emp dept it is not possible in int emp=3.
     //so we take static for memory and fast run and dirctly chnage all
	String empmailid;
	int empsalary;
	
	
	public void Display() {
		System.out.println("Employee ID="+empid);
		System.out.println("Employee Name="+empname);
		System.out.println("Employee Dept="+empdept);
		System.out.println("Employee MailID="+empmailid);
		System.out.println("Employee Salary="+empsalary);
	}
	
	public static void main(String[] args) {
		EmployeeSameDepartmentProgram emp1=new EmployeeSameDepartmentProgram();
		emp1.empid=1;
		emp1.empname="Shailesh";
		emp1.empmailid="Shai@gmail";
		emp1.empsalary=20000;
		emp1.Display();
		
	System.out.println("******************");
	
	EmployeeSameDepartmentProgram emp2=new EmployeeSameDepartmentProgram();
	emp2.empid=2;
	emp2.empname="Yogesh";
	emp2.empdept=2;
	
	emp2.empmailid="yogi@gmail";
	emp2.empsalary=17000;
	emp2.Display();
	
	System.out.println("**************");
	
	EmployeeSameDepartmentProgram emp3=new EmployeeSameDepartmentProgram();
	emp3.empid=3;
	emp3.empname="prashant";
	emp3.empmailid="pras@gmail";
	emp3.empsalary=17000;
	emp3.Display();
		
	}

}

