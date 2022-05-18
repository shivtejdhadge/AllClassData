package Constructor;

public class DemoMain {
	public static void main(String[] args) {
		
		//Zero Argument no paramater
		Demo S1=new Demo();
		S1.a=102;
		S1.b="Rajesh";
		S1.Display();
		System.out.println("****Studnet 2********");
		Demo S2=new Demo();
		S2.a=103;
		S2.b="Nitin";
		S2.Display();
		
		//With Constructor Argument
		
//		System.out.println("****Student 1 ****");
//		Demo St1=new Demo(102,"Ankit");
//		St1.Display();
//		System.out.println();
//		System.out.println("****Student 2 ****");
//		Demo St2=new Demo(103,"Nilesh");
//		St2.Display();

		//Using method
		Demo S3=new Demo();
		S3.M1(102, "Ank");
	     S3.Display();
	}
}
