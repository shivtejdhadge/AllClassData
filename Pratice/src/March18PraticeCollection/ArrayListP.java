package March18PraticeCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayListP {
	public static void main(String[] args) {
	
		ArrayList a=new ArrayList();
		
		a.add("Green");
		a.add("Orange");
		a.add("Pink");
		a.add("Black");
		a.add("White");
		a.add("Yellow");
		a.add("Blue");
		System.out.println(a);
		System.out.println("Empty="+a.isEmpty());
		System.out.println("Index of Black="+a.indexOf("Black"));
		System.out.println("Last index of black="+a.lastIndexOf("Black"));
		System.out.println("Size="+a.size());
		System.out.println("Get value of Index 3="+a.get(3));
		a.add(7,"Red");
		System.out.println(a);
		System.out.println("Size="+a.size());
		a.add(3,"dark");
		System.out.println(a);
		System.out.println("Remove="+a.remove(3));
		System.out.println(a);
		
		//Read Value
		System.out.println("********Read by For Loop*****");
		for(int i=0;i<a.size();i++) {
			System.out.print(a.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("********Read By Advance Loop*******");
	     for(Object adv:a) {
	    	 System.out.print(adv+" ");
	     }
		System.out.println();
	     System.out.println("******Read by  Iterator**********");
	     Iterator itr=a.iterator();
	     
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		System.out.println("*********Read by ListIterator*********");
		ListIterator litr=a.listIterator();
		
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		
		
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("*********Add Vector/Link");
		
		LinkedList l=new LinkedList();
		l.add("Link");
		l.add("List");
		System.out.println(l);
		
		Vector v=new Vector();
		v.add("Vect");
		v.add("VEctor");
		System.out.println(v);
		
		System.out.println(a);
		a.addAll(v);
		System.out.println(a);
		a.addAll(l);
		System.out.println(a);
		
		Collections.sort(a);
		System.out.println(a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}
