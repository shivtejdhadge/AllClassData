package Collections;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistExampels {
	public static void main(String[] args) {
		
		LinkedList llist=new LinkedList();
		llist.add(100);
		llist.add(500);
		llist.add("ABC");
		llist.add("XYZ");
		System.out.println(llist);
		llist.set(000000, 1000);
		System.out.println(llist);
	     llist.remove(1);
	     System.out.println(llist);
	     System.out.println("Check="+llist.remove(0));
	     System.out.println(llist);
	     
	     System.out.println("Index of 2="+llist.indexOf("ABC"));
	     llist.addFirst(100);
	     llist.addLast(5000);
	     System.out.println(llist);
	     System.out.println("Index of 2="+llist.indexOf("ABC"));
	     
	    System.out.println( llist.getFirst());
	     System.out.println(llist.getLast());
	     llist.removeFirst();
	     System.out.println(llist);
	    llist.removeLast();
	    System.out.println(llist);
	    
	    System.out.println("*******For Lopp******");
	  for(int i=0;i<llist.size();i++) {
		  System.out.print(llist.get(i)+" ");
	  }
	     
		System.out.println();
	  System.out.println("*******Adance Lopp******");
	  for(Object adv:llist) {
		  System.out.print(adv+" ");
	  }
	  
	  System.out.println();
		System.out.println("******LinkList*********");
		ListIterator litr=llist.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" "
					+ "");
		}
		
	}

}
