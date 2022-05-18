package Constructor;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeDataUsingConstructor Emp1=new EmployeDataUsingConstructor("Ankit","22Jan",11.6,"IBM","22-Feb-");
         Emp1.display();
         
         System.out.println("=============");
 		EmployeDataUsingConstructor Emp2=new EmployeDataUsingConstructor("Rajesh","22Jan",4.6,"QK","22-Feb-");
         Emp2.display();
	}

}
