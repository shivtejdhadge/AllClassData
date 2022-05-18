package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashsetExample {
	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add("A");
		lh.add("B");
		lh.add("C");
		lh.add("D");
		lh.add("E");
		lh.add("a");
		lh.add("z");
		System.out.println(lh);
		lh.add("A");
		System.out.println(lh.contains("A"));
		System.out.println("Empty="+lh.isEmpty());
		System.out.println(lh.remove("D"));
		lh.remove(1);
		System.out.println(lh.size());
		System.out.println(lh);
		//Read
		
		for(Object adv:lh) {
			System.out.print(adv+" ");
		}
		
		System.out.println();
		Iterator itr=lh.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		
		
		
		
		
		
	}

}
