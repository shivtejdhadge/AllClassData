package SundayPratice;

public class Constructor {
	
	 static String Mtype="Elec";
	String Mname;
	int Mqty;
	String MSplace;
	
	Constructor(String a,String b,int c,String d){
        	Mtype=a;
		Mname=b;
		Mqty=c;
		MSplace=d;
	}
	
	
	public void display() {
		System.out.println("Materail Type="+Mtype);
		System.out.println("Materail Name="+Mname);
		System.out.println("Material Available Qty="+Mqty);
		System.out.println("Material Staorage Place="+MSplace);
	}
	
	
}

   
