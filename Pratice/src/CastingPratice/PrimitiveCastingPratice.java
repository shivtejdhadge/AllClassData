package CastingPratice;

public class PrimitiveCastingPratice {
	
	public static void main(String[] args) {
		
		//Implicit Casting-Lower To Higher
		
		byte b=125;
		System.out.println(b);
		short s=b;
		System.out.println(s);
		int i=s;
		System.out.println(i);
		long l=i;
		System.out.println(l);
		float f=l;
		System.out.println(f);
		double d=f;
		System.out.println(d);
		
		//Explicit Casting-Higher to Lower
		
		System.out.println("*********Explicit*******");
		double de=125.987654321;
		System.out.println(de);
		float fe=(float) de;
		System.out.println(fe);
		long le=(long) fe;
		System.out.println(le);
		int ie=(int) le;
		System.out.println(ie);
		short se=(short) ie;
		System.out.println(se);
		byte be=(byte) se;
		System.out.println(be);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
