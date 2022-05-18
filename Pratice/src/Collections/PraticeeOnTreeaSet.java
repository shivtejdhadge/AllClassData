package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class PraticeeOnTreeaSet {
	
	//Tree Set

	public static void main(String[]args) {

	TreeSet<String> t=new TreeSet<String>();

	//Treeset t=new treeset();

	t.add("Yogesh");
	t.add("Unati");
	t.add("Pradnya");
	t.add("Shivtej");

System.out.println(t);
	System.out.println(t.isEmpty());
	t.remove("Shivtej");
	System.out.println(t);
	System.out.println(t.size());
    System.out.println(t.first());
    System.out.println(t.last());

         t.pollFirst();
         t.pollLast();
       System.out.println(t);

       t.add("Shivtej");
       t.add("Pardnya");
System.out.println("****");
System.out.println(t);
	System.out.println(t.higher("Shivtej"));

	System.out.println(t.lower("Shivtej"));

    Iterator itr=t.iterator();
    while(itr.hasNext()) {
    	System.out.println(itr.next());
    }
    

	for(Object adv:t) {
		System.out.println(adv);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
