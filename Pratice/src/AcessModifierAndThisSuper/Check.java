package AcessModifierAndThisSuper;

public class Check extends AcessModifier{
	
	int a=50;
	public void display(){
		int a=100;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println("******** Calculation*********");
		System.out.println("parent global+local="+(a+super.a));
		System.out.println("Global+Local="+(this.a+a));
		System.out.println("global+Aprent Global="+(this.a+super.a));	
	}
	
	public static void main(String[] args) {
		Check Obj=new Check();
		Obj.display();	
	}
	
	
	
	
	
	
}
