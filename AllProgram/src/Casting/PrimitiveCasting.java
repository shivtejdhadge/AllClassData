package Casting;

public class PrimitiveCasting {
	 //Casting-Change one typr of info into another info
	//Type of Casting-1.Primitive 2.Non-Primitive
	
	//Primitive-
	//1.Implicit-Lower to Higher 
    //2.Explicit-Higher to Lower
	//3.Bollean- Not suport bcz True and False
	
	
	//Implicit====> byte==> short ==> int  ==> long==> float==> double.
	
	public static void main(String[] args) {
		
		double db=10.4343476;
		System.out.println(db);
		float fd=(float) db;//Data Loss
		System.out.println(fd);
		
		
		
		System.out.println("++++++++++++++++++++");
		
	
	byte b=10;
	System.out.println("Byte Value="+b);
	short s=b;
	System.out.println("Short Value="+s);
	int i=s;
	System.out.println("int value="+i);
	long l=i;
	System.out.println("Long Value="+l);
	float f=l;
	System.out.println("Float Value="+f);
	double d=f;
	System.out.println("Double Value="+d);
	int id=(int) d;
	System.out.println("Try to Hight to Low="+id);//Data Loss
	
System.out.println("**********Explicit Casting*********");
	// explicit casting
	// double==>float==>long==> int==>  short==>byte
    //Not Using because of data loss
	
	double ed=23.45789890;
	System.out.println("Double Value="+ed);
	float ef=(float) ed;
	System.out.println("Float Value="+ef);
	long el=(long) ef;
	System.out.println("Long Value="+el);
	int ei=(int) el;
	System.out.println("Int Value="+ei);
	short es=(short) ei;
	System.out.println("Short Value="+es);
	byte bs=(byte) es;
	System.out.println("Byte Value="+bs);
	

}
}