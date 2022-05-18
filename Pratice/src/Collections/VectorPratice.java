package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPratice {
	public static void main(String[] args) {
		
		Vector vec=new Vector();
		
		vec.add(10);
		vec.add(20);
		vec.add("a");
		vec.add(30);
		System.out.println(vec);
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		System.out.println("emptyness="+vec.isEmpty());
		System.out.println("Indexof-a"+vec.indexOf("a"));
		System.out.println("last index of a ="+vec.lastIndexOf("a"));
	    System.out.println("COntains="+vec.contains(30));
	    vec.remove(2);
	    System.out.println(vec);
	    vec.add(2, "ABC");
	    System.out.println(vec);
	   
	    //Read-for loop
	    System.out.println("******For Loop******");
	    for(int i=0;i<vec.size();i++) {
	    	System.out.print(vec.get(i)+" ");
	    }
	    
	    System.out.println();
	    System.out.println("*******Advanvce*****");
		for(Object adv:vec) {
			System.out.print(adv+" ");
		}
		
		
		System.out.println();
		System.out.println("*********iterator*********");
		Iterator vitr=vec.iterator();
		while(vitr.hasNext()) {
			System.out.print(vitr.next()+" ");
		}
		
		
		
		System.out.println();
		System.out.println("*********listiterator*********");
		
		ListIterator litr=vec.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		
		//Only forVector 
		
		System.out.println();
		System.out.println("******Enumeration(Only For Vector)*********");
		Enumeration eitr=vec.elements();
		while(eitr.hasMoreElements()) {
			System.out.print(eitr.nextElement()+" ");
		}
		
		
		
		
		
	}

}
