package SundayPratice;

public class inheritanceChild extends Inheritance {
	
	String Ename;
	int EEmpid;
	String EAdd;
	
	public void OCS(String a,int b,String c){
		Ename=a;
		EEmpid=b;
		EAdd=c;
	}
	public void displayo() {
		System.out.println("OCS Eng Name="+Ename);
		System.out.println("OCS Eng EmpId="+EEmpid);
		System.out.println("OCS Eng Adress="+EAdd);
	}
public static void main(String[] args) {
		
	inheritanceChild o1=new inheritanceChild();
	
		o1.OCS("Shivtej",1,"Dighi");
		o1.displayo();
	o1.displayj();
	o1.JCI("Ganesh",2,"Dighi");
		
		
	}
	
	


}