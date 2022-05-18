package March18PraticeCollection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorP {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		
		v.add("Green");
		v.add("Yellow");
		v.add("White");
		v.add("Black");
		v.add("Blue");
		v.add("Pink");
		System.out.println(v);
		System.out.println("Size="+v.size());
		System.out.println("Capacity="+v.capacity());
		System.out.println("Remove="+v.remove(3));
		System.out.println(v);
		v.add(3,"Black");
		System.out.println(v);
		System.out.println("Size="+v.size());
		v.add(6,"Red");
		System.out.println(v);
		
		
		//read
		System.out.println("************Get For*******");
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}
		
		
		System.out.println();
		System.out.println("**********Get Advance*****");
		for(Object adv:v) {
			System.out.print(adv+" ");
		}
		
		System.out.println();
		System.out.println("*************Get Iterator********");
		
		Iterator itr=v.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		System.out.println("***********Enumeration*********");
		
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			System.out.print(e.nextElement()+" ");
		}
		System.out.println();
		System.out.println("***********ListIterator*********");
		
		ListIterator litr=v.listIterator();
		
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		
		
	}

}
