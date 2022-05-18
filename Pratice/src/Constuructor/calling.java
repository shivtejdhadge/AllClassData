package Constuructor;

public class calling {
	
	
	private calling(){
		
		this(10);
		System.out.println("1st Call");
		
	}
	
	public calling(int a){
		System.out.println("2nd Call");
	}
	
	public static void main(String[]args) {
		calling c=new calling();

	}
	
	
	
	
}
