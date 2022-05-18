package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistPratice {
	public static void main(String[] args) {
		ArrayList arl=new ArrayList();
//		ArrayList<String> arls=new ArrayList<String>();
//		ArrayList<Integer> arli= new ArrayList<Integer>();
//		
		arl.add("Shiv");
		arl.add("Vaib");
		arl.add("Raj");
		arl.add(2000);
		arl.add(1000);
		arl.add(3000);
		
		System.out.println(arl);
		System.out.println("Index Of Raj="+arl.indexOf("Raj"));
		arl.add(2,2000);
		System.out.println(arl);
		System.out.println("Index Of Raj AFTER ADD="+arl.indexOf("Raj"));
		System.out.println("");
		arl.set(2,0);
		System.out.println(arl);
		arl.remove(2);
		System.out.println(arl);
		
		System.out.println("contains="+arl.contains(200054));
		
		System.out.println("Emptyness="+arl.isEmpty());
		System.out.println("index of Raj="+arl.indexOf("Raj"));
		arl.add("Raj");
		System.out.println(arl);
		System.out.println("Last index of Raj="+arl.lastIndexOf("Raj"));
		System.out.println("Checking index"+arl.indexOf("Raj"));
		System.out.println("Size="+arl.size());
		
		
		System.out.println(arl);
		System.out.println("Get Valuve="+arl.get(0));
		
		
		//Read-Using FOr
		
		for(int i=0;i<arl.size();i++) {
			System.out.print(arl.get(i)+" ");
		}
		
		System.out.println();
		//using Advance java
	for(Object adv:arl) {
		System.out.print(adv+" ");
	}
	
	//using Cursor-Iterator
	System.out.println();
       Iterator itr=arl.iterator();
       while(itr.hasNext()) {
    	   System.out.print(itr.next()+ " ");
       }
	
    System.out.println();   
       //List iterator
       ListIterator litr=arl.listIterator();
       while(litr.hasNext()) {
    	   System.out.print(litr.next()+" ");
       }
	
		
		//Reverse
       System.out.println();
       System.out.println("Reverse");
       System.out.println("Befoure Reverse"+arl);
       Collections.reverse(arl);
       System.out.println("After Reverse"+arl);

		
		
	}

	
}
