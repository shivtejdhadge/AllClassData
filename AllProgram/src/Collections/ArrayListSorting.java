package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	
	public static void main(String[] args) {
		
		ArrayList<String> als=new ArrayList<String>();
		als.add("BCB");
		als.add("Apple");
		als.add("Ballon");
		als.add("Zebra");
		als.add("abc");
		System.out.println("*********Acending*******");
		System.out.println("String Arraylist Acending before Sort="+als);
		Collections.sort(als);
		System.out.println("String Arraylist Acending after Sort="+als);
		System.out.println();
		System.out.println("*********Decending*******");
		System.out.println("String arraylist Decending Before ="+als);
		Collections.sort(als,Collections.reverseOrder());
         System.out.println("String arraylist Decending After="+als);
		
		ArrayList<Integer> ali=new ArrayList<Integer>();
		
		ali.add(15);
		ali.add(25);
		ali.add(200);
		ali.add(356);
		ali.add(56);
		ali.add(800);
		System.out.println("*********Acending*******");
		System.out.println("Integer arraylist Asending Before"+ali);
		Collections.sort(ali);
		System.out.println("Integer Arraylist Asending After="+ali);
		
		System.out.println();
		System.out.println("*********Decending*******");
		System.out.println("Integer Arraylist Decending  Befoure Sorting="+ali);
	    Collections.sort(ali,Collections.reverseOrder());
		System.out.println("Integer Arraylist Decending  After Sorting="+ali);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
