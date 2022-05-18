package March18PraticeCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class HashSetP {

	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add(100);
		h.add("AC");
		h.add("DC");
		System.out.println(h);
		System.out.println("Size="+h.size());
		System.out.println("Empty="+h.isEmpty());
		System.out.println(h.remove(100));
		System.out.println(h);
		h.add(1);
		System.out.println(h);
		
		
		LinkedList l=new LinkedList();
		l.add("Link");
		l.add("List");
		Vector v=new Vector();
		v.add("Vect");
		v.add("VEctor");
		System.out.println(v);
		System.out.println(l);
		System.out.println(h);
		h.addAll(l);
		h.addAll(v);
		System.out.println(h);
		
		
		
		//Read
		Iterator itr=h.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		System.out.println();
		for(Object adv:h) {
			System.out.print(adv);
		}
		


	}

}
