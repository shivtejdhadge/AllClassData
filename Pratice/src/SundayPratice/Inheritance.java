package SundayPratice;

public class Inheritance {
	
	String Ename;
	int EEmpid;
	String EAdd;
	
	
	public void JCI(String a,int b,String c){
		Ename=a;
		EEmpid=b;
		EAdd=c;
	}
	public void displayj() {
		System.out.println("JCI Eng Name="+Ename);
		System.out.println("JCI Eng EmpId="+EEmpid);
		System.out.println("JCI Eng Adress="+EAdd);
	}
	public static void main(String[] args) {
		
		Inheritance j1=new Inheritance();
		j1.JCI("Rajesh",1,"Dighi");
		j1.displayj();
		
	}
	
	
	
	
	

}
