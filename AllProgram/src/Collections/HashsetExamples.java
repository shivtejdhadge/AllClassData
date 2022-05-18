package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetExamples {
	
	public static void main(String[] args) {
		
		
		
		
		//set not allow Dublicate
		//Only one Null Accept
		//Random Order Insertion expect Linked Hashset
		
		//Hashset
		//Random Order Insertion 
		//Remove by object not by index bcznot follow index
		
		HashSet<String> s=new HashSet<String>();
//		HashSet sc=new HashSet();
//		sc.add(10);
//		sc.add("ABCf");
//		sc.add("Abc");
//		sc.add("Cde");
//		sc.add(101);
//		sc.add(1000);
		s.add("pqr");
		s.add("Abc");
		s.add("Cde");
		s.add("Pqr");
		s.add("abc");
		s.add("pqr");
		s.add("A");
		s.add("A");
		s.add(null);
		s.add(null);
		
		
		System.out.println(s);
		System.out.println("Emptness="+s.isEmpty());
		System.out.println("Contains="+s.contains("A"));
//		s.add(2,"QWE");
         s.remove("A");	//	 by object only
         System.out.println(s);
		System.out.println(s.size());
		
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("Rajesh");
		a.add("pqr");
		a.add("Abc");
		a.add("Cde");
		a.add("Pqr");
		a.add("abc");
		a.add("Shivtej");
		a.add("Vaibhav");
		
		//add array in hashset
		s.addAll(a);
		System.out.println(s);
//		a.addAll(s);     //hash set add in array 
//		System.out.println(a);
		System.out.println(s.size());
		System.out.println("");
		
		//System.out.println(sc);
		
		//raed For
		
//		for(int i=0;i<s.size();i++) {
//			System.out.println();
//		}
		
		//Read Adavance-
		System.out.println("******Advance Lopp for Read******");
		for(String adv:s) {
			System.out.print(adv+" ");
		}
		
		//Read Using Iterator
		System.out.println();
		System.out.println("********Iterator*********");
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
		//For Lopp,Listiterator anmd Enumuration cant support
		
		
		
	}
	
	

}
