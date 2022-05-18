package March18PraticeCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinklistP {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		
		l.add(10);
		l.add(20);
		l.add(350);
		l.add(9975);
		System.out.println(l);
		
		System.out.println("Size="+l.size());
		System.out.println("Get Value="+l.get(0));
		//System.out.println("Get Object="+l.get(10));
	    System.out.println("Get First="+l.getFirst());
	    System.out.println("Get Last="+l.getLast());
		System.out.println("Remove Last="+l.removeLast());
		System.out.println("Remove First="+l.removeFirst());
		
		l.addFirst("1st");
		l.addLast("Last");
		System.out.println(l);
		
           //Read 
		System.out.println("*******For *************");
		for(int i=0;i<l.size();i++) {
			System.out.print(l.get(i)+" ");
		}
		
		for(Object adv:l) {
			System.out.print(adv+" ");
		}
		
	      Iterator itr=l.iterator();
	      while(itr.hasNext()) {
	    	  System.out.print(itr.next()+" ");
	      }
		
	      ListIterator litr=l.listIterator();
	      while(litr.hasNext()) {
	    	  System.out.println(litr.next());
	      }
		
		
		
		
		
		
		
		
	}

}
