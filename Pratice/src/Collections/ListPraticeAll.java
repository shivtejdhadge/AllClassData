package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class ListPraticeAll {
	public static void main(String[] args) {
		
		//List-Interface Class
		//Properties-Accept Null And Dublicate values
		
		//ArrayList-Vector-Linklist-Implementation Class
		
		//Array List
		//Resizable data Structure
		//default capa-10
		//incremental capacity= C.C*3/2+1
		//best-Retrival and worst-Maniputaion
		
//		ArrayList arl= new ArrayList();
//		ArrayList<String> arls=new ArrayList<String>();//Generic
//		ArrayList<Integer> arli=new ArrayList<Integer>();
//		arl.add(10);
//		arl.add("ABC");
//		arl.add("PQR");
//		System.out.println(arl);
//		System.out.println(arl.size());
//		System.out.println("Contain="+arl.contains("PQR"));
//		arl.set(1,20);
//		System.out.println(arl);
//		arl.remove(1);
//		System.out.println(arl);
//		System.out.println("Index 10="+arl.indexOf(10));
//		arl.add(10);
//		System.out.println(arl);
//		System.out.println("Indexlast10="+arl.lastIndexOf(10));
//		
//		
//		//read
//		for(int i=0;i<arl.size();i++) {
//			System.out.print(arl.get(i)+" ");
//		}
//		
//		System.out.println();
//		//advance
//		for(Object adv:arl) {
//			System.out.print(adv+ " ");
//		}
//		
//		System.out.println();
//		
//		//Iterator
//		Iterator itr=arl.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
//		
//		//listiterator
//		
//		System.out.println();
//		ListIterator litr=arl.listIterator();
//		while(litr.hasNext()) {
//			System.out.print(litr.next()+" ");
//		}
//		
//		
//		Vector vec=new Vector();
//		Vector<String> svec=new Vector<String>();
//		Vector<Integer> ivec=new Vector<Integer>();
//		vec.add(10);
//		vec.add(20);
//		vec.add("ABC");
//		svec.add("10");//generic
//		ivec.add(100);//generic
//		
//		System.out.println(vec.capacity());
//		System.out.println(vec.size());
//		System.out.println(vec);
//		
//		
//		Enumeration eitr=vec.elements();
//		while(eitr.hasMoreElements()) {
//			System.out.print(eitr.nextElement()+" ");
//		}
		
		
		//LinkList
		
//		LinkedList l=new LinkedList();
//		
//		l.add(10);
//		l.add("Z");
//		l.add("AbC");
//		l.add("PQR");
//		l.add(20);
//		System.out.println(l);
//		l.set(0, 100);
//		System.out.println(l);
//	    l.add(2,"PW");
//	    System.out.println(l);
//		l.remove("PW");
//		System.out.println(l);
//		l.addFirst("1St");
//		l.addLast("Last");
//		System.out.println(l);
//		l.removeLast();
//		System.out.println(l);
//		l.removeFirst();
//		System.out.println(l);
//		System.out.println(l.getLast());
//		System.out.println(l.getFirst());
//		
		
		//Sorting Array
		
		ArrayList<String> sort=new ArrayList<String>();
        
		sort.add("Lapptop");
		sort.add("Charger");
		sort.add("Mouse");
		sort.add("Keyboard");
		sort.add("camera");
		System.out.println("Before Sorting Acending"+sort);
		Collections.sort(sort);
		System.out.println("After Sorting Acending"+sort);
		
		System.out.println("Before Sorting Decending"+sort);
		Collections.sort(sort,Collections.reverseOrder());
		System.out.println("After Sorting Decending"+sort);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
