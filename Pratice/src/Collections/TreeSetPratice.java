package Collections;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetPratice {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		//Asending default
		t.add("IBM");
		t.add("Job");
		t.add("Software");
		t.add("Z");
		t.add("A");
		t.add("A");
		t.add("null");//null not accept
		
		System.out.println(t);
		ArrayList a=new ArrayList();
		a.add("Zarray");
		a.add("A-array");
		a.add("new A");
		
		
		System.out.println("********Array******");
		t.addAll(a);
		System.out.println(t);
		
		
		
		System.out.println(t);
		System.out.println("Size="+t.size());
		System.out.println("Empty="+t.isEmpty());
		//remove by oject only
	    //Remove with True
		System.out.println("Remove="+t.remove("A"));
		System.out.println(t);
		System.out.println(t.first());
		System.out.println(t.last());
		
		String s="Z";
		System.out.println("Higher Value="+t.higher(s));
		System.out.println("Lower Value="+t.lower(s));
		
		t.pollFirst();
		t.pollLast();
		System.out.println(t);
		
		
		
		
		
		
		
		
		
	}

}
