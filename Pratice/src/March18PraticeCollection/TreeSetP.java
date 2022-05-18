package March18PraticeCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetP {
	public static void main(String[] args) {

		TreeSet t=new TreeSet();
		t.add(100);
		t.add(72360);
		t.add(65);
		t.add(45);
		System.out.println(t);
		t.add(457);
		System.out.println(t);
		System.out.println("Size"+t.size());
		System.out.println("Empty"+t.isEmpty());
		System.out.println("Remove="+t.remove(45));
		System.out.println(t);
		
		
		int a=100;
	     System.out.println("Higher Value="+t.higher(a));
	     System.out.println("Lower VAlue="+t.lower(a));
	     
	     t.pollFirst();
	     t.pollLast();
	     System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		System.out.println(t);
		t.add(2345);
		t.add(6789);
		t.add(123);
		System.out.println(t);
		
		System.out.println("**********ReAD*********");
		for(Object adv:t) {
			System.out.print(adv+" ");
		}
		
		Iterator itr=t.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		
		
		
	}

}
