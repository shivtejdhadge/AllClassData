package March18PraticeCollection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetP {
	public static void main(String[] args) {
		
		LinkedHashSet ls=new LinkedHashSet();
		
		ls.add(100);
		ls.add("Linked");
		ls.add("HashSet");
		System.out.println(ls);
		ls.add(1000);
		System.out.println("Size="+ls.size());
		ls.add(null);
		ls.add(null);
	    ls.add(1001);
		System.out.println(ls);
		
		
		System.out.println("******Read advan********");
		for(Object adv:ls) {
			System.out.print(adv+" ");
		}
		System.out.println();
		System.out.println("*********Interator******");
		Iterator itr=ls.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
