package Constuructor;

public class Demo {
	
	int a;
	String b;
	
//	Demo(){
//		System.out.println("Zero");
//		System.out.println(a);
//		System.out.println(b);		
//	}
	
	Demo(int c,String d){
		a=c;
		b=d;
	}
	public void Dislay() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		//Demo s=new Demo();
		Demo D=new Demo(10,"hjgd");
		D.Dislay();
		
		
		
		
		
		}
	
	
	
	
	
	

}
