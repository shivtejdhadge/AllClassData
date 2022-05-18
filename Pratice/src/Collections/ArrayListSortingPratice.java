package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingPratice {
	public static void main(String[] args) {
		ArrayList<String> arls=new ArrayList<String>();
		arls.add("Rajesh");
		arls.add("Vaibhav");
		arls.add("Manish");
		arls.add("Harshal");
		arls.add("Shivtej");
		arls.add("Avinash");
		arls.add("anit");
		
		System.out.println("Arraylist String Asending Befoure="+arls);
		Collections.sort(arls);
		System.out.println("Arraylist Asemdong After="+arls);
		
		System.out.println("Decending");
		Collections.sort(arls,Collections.reverseOrder());
		System.out.println("Arraylist Decending After="+arls);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
