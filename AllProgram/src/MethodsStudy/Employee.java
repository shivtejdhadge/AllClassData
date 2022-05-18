package MethodsStudy;

public class Employee {
	
	int empid;
	String empname;
	char empgender;
	String empmailid;
	double empsalary;
	String empposition;
	int empdeptno;
	
	public void Display() {
		//System.out.println("Start Main Method");
		System.out.println("Employee ID="+empid);
		System.out.println("Employee Name="+empname);
		System.out.println("Employee Gender="+empgender);
		System.out.println("Employee Mail-ID="+empmailid);
		System.out.println("Employee Salary="+empsalary);
		System.out.println("Employee Position="+empposition);
		System.out.println("Employee DepartmentNumber="+empdeptno);
	
	}
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		emp1.empid=100;
		emp1.empname="Vivek P";
		emp1.empgender='M';
		emp1.empposition="MST";
		emp1.empmailid="vp@gmail.com";
		emp1.empdeptno=3;
		emp1.empsalary=15000;
		emp1.Display();
		
		System.out.println("*************Emp2*****");
		Employee emp2=new Employee();
		emp2.empdeptno=3;
		emp2.empgender='M';
		emp2.empid=101;
		emp2.empmailid="MP@gmail";
		emp2.empname="Mayur P";
		emp2.empposition="MST";
		emp2.empsalary=18000;
		emp2.Display();
				
	}
	
	

}
