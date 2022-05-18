package March27SundayPratice;

public class ConstructorP {
//	int a;
//	int b;
	
	ConstructorP(int a,int b){
		System.out.println(a*b);
	}
	ConstructorP(double a,double b,double c){
		System.out.println(a*b-c);
	}
	
	ConstructorP(int a,int b,int c){
		System.out.println(a*b+c);
	}
	public static void main(String[] args) {
		ConstructorP c=new ConstructorP(10,200);	
		ConstructorP d=new ConstructorP(10.0,10,10);
	}
}
