package March18PraticeCollection;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySortingP {
	public static void main(String[] args) {
		
	
	ArrayList as=new ArrayList();
	
	as.add(100);
	as.add(101);
	as.add(405);
	as.add(399);
	as.add(7888);
	as.add(999);
	as.add(12);
//	System.out.println(as);
//	Collections.sort(as);
//	System.out.println("Array Asending="+as);
//	System.out.println(as);
//	Collections.sort(as,Collections.reverseOrder());
//	System.out.println("Decending="+as);
//	Collections.reverse(as);
//	System.out.println(as);
//	
	
	System.out.println(as);
	Collections.reverse(as);
	System.out.println("Reverse="+as);
	
	Collections.sort(as);
	System.out.println("Asending="+as);
	System.out.println(as);
	Collections.sort(as,Collections.reverseOrder());
	System.out.println("Desending="+as);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}