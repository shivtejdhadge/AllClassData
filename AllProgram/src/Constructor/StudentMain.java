package Constructor;

public class StudentMain {

	public static void main(String[] args) {
		
//		 initialization by object.
//		 approach 1
		Student s = new Student();	
		s.rollno=101;
		s.sname="ABC";
		s.grade='c';
		s.display();
		Student s1 = new Student(101,"Bcg",'C');
			   s1.display();
		
		// approach 2.
//		System.out.println("==========================================================");
//		Student s1 = new Student();
//		s1.getstudentdetails(102, "xyz", 'A');
//		s1.display();
		
		// approch 3 constructor
		
//		Student s3= new Student (103,"PQR",'A');
//		//s3.display();
		
	}
}
	
	


