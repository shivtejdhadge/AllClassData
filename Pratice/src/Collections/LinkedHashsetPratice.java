package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetPratice {
	public static void main(String[] args) {
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add("%$");
		lh.add("IBM");
		lh.add(9999);
		lh.add(1234);
		System.out.println(lh);
		System.out.println("Emptyness="+lh.isEmpty());
		
		//remove by oject only
	    //Remove with True
		System.out.println("Remove="+lh.remove("IB"));//false not delete
		lh.remove(1);//Not Working 
		System.out.println("Size="+lh.size());
		System.out.println(lh);
		ArrayList a= new ArrayList();
		a.add("Array");
		a.add("2nd");
		a.add(1234);
		
		lh.addAll(a);
		System.out.println(lh);
		
		//Read by iterator
		System.out.println("*******Read by Iterator*****");
		Iterator  itr=lh.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		//Read By Advance
		System.out.println();
		System.out.println("*********Read By Advance**********");
		for(Object adv:lh) {
			System.out.print(adv+" ");
		}
		
		
	}

}
