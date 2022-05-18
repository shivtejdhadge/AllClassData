package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPratice {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		hs.add("&");
		hs.add("A");
		hs.add(2);
		hs.add("%%");
		hs.add(200);
		System.out.println(hs);
		
		//remove by oject only
		//Remove with True
		System.out.println(hs.remove(2));
		System.out.println(hs);
	    System.out.println(	hs.size());
		ArrayList a=new ArrayList();
		a.add("ABC");
		a.add("PQR");
		a.add("CBZ");
		hs.addAll(a);
		System.out.println(hs);
		
		
		//read
		
		System.out.println("********Read By Iterator*******");
		Iterator itr=hs.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+ " ");
		}
		
		//Advance
		System.out.println();
		System.out.println("********Read by Advance********");
		for(Object adv:hs) {
			System.out.print(adv+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
