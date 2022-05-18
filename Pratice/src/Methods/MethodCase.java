package Methods;

public class MethodCase {
	
	//Case1-No accept para no return 
	 int a=1;
	 int b=1;
	public  void Case1() {
		System.out.println("Ghjg");
		
	}
	public   int Case2() {
		return a+b;
		
	}
	public  void Case3(int a ,int b) {
		//System.out.println(a+b);
	}
	public int Case4(int a,int b) {
		return a-b;
	}
	
	public static void main(String[] args) {
		MethodCase C= new MethodCase();
		C.Case1();
		System.out.println("Case1-NoReturn="+C.Case2());
		C.Case3(1, 2);
		System.out.println(C.Case4(0, 2));
	}

}
