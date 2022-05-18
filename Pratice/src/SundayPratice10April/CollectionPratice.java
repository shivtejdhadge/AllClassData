package SundayPratice10April;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionPratice {
	public static void main(String[] args) {
		
		//list-Arrylist
		
		ArrayList al=new ArrayList();
		al.add("Five");
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		System.out.println(al);
		
		al.set(0, "First");
	
		al.add(3,"1");
		System.out.println(al);
	System.out.println(	al.get(4));
		
		al.remove("1");
		System.out.println(al);
		
		
		//Read-for loop
		al.add(1);
		
//		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
	
		//Uing advance
		
//		for(Object adv:al) {
//			System.out.print(adv);
//		}
		
		//iterator
		
//		Iterator itr=al.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println("Itr"+itr.next());
//		}
		
		//linked list
		
//		ListIterator lis=al.listIterator();
//		
//		while(lis.hasNext()) {
//			System.out.println(lis.next());
//		}
      	System.out.println(al);
		System.out.println(al.get(5));
		al.remove(5);
		System.out.println("Befoure Sort-->"+al);
		
//		Collections.sort(al);
//		
//		System.out.println("After Sort-->"+al);
////		
//		
//		Collections.reverse(al);
//		System.out.println("After reverse-->"+al);
//		
//		Collections.sort(al,Collections.reverseOrder());
//		
//		System.out.println("After Decending-->"+al);
//		
//		
//		
		System.out.println("*************LinkedList*********************");
		LinkedList ll=new LinkedList();
		ll.add("A");
//		ll.addAll(al);
//		System.out.println("Check"+ll);// add arry to linklist
//	
		ll.add("Z");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		System.out.println(ll);
	
		System.out.println("Size"+ll.size());
		
		ll.remove("Z");
		System.out.println(ll);
		
		ll.set(0, "a");
		
		System.out.println(ll);
		
		//read
		
//		for(int i=0;i<ll.size();i++) {
//			System.out.print("For"+ll.get(i));
//		}
//		
//		for(Object adv:ll) {
//			System.out.print("advance"+adv);
//		}
		
//		
//		Iterator litr=ll.iterator();
//		while(litr.hasNext()) {
//			System.out.print("iterator"+litr.next());
//		}
//		
		ListIterator llitr=ll.listIterator();
		
//		while(llitr.hasNext()) {
//			System.out.print(llitr.next());
//		}
		
		
		System.out.println(ll);
//		Collections.sort(ll);
//		System.out.println("After Sort"+ll);
//		Collections.sort(ll,Collections.reverseOrder());
//		System.out.println("After Revrse="+ll);
////		
//		Collections.reverse(ll);
//		System.out.println(ll);
		
		
		System.out.println("*******************Vector*********************");
		Vector v=new Vector();
		v.add("Red");
		v.add("Black");
		v.add("White");
		v.add("Orange");
		
//		v.addAll(ll);
//		v.addAll(al);
		System.out.println(v);
		
		
	
		System.out.println(v.capacity());
		
//		Enumeration en=v.elements();
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
//		
//		Enumeration en=v.elements();
//		while(en.hasMoreElements()) {
//			System.out.println(en.nextElement());
//		}
		System.out.println("Spl**************");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
        ll.addFirst("Li");
		ll.addLast("Kiii");
	
		
		
		System.out.println(ll);
		
	
		System.out.println("**************HashSet************");
		TreeSet hs=new TreeSet();
		
	//	hs.addAll(ll);
	hs.add("Sh");
//		hs.add(2);
//		hs.add(3);
//		hs.add(5);
//		hs.add(4);
//		hs.add(4);
//		//hs.add(null);
//		hs.add(34);
//		hs.add(7);
////		hs.remove(7);
////		hs.remove(3);
//		System.out.println(hs);
//		
//		System.out.println(hs.first());
//		System.out.println(hs.last());
//		System.out.println(hs.pollFirst());
//		System.out.println(hs.pollLast());
//		System.out.println(hs.higher(4));
//		System.out.println(hs.lower(4));
//		System.out.println(hs);
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
