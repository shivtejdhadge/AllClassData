package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExamples {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add("3rd");
		
		System.out.println(al);
		al.add(2,200);//add-200 at 2 index other shift right
		System.out.println(al);
		al.add(3,"abx");
		System.out.println(al);
		al.remove(3);//remove index other shift left
		System.out.println(al);
		System.out.println("Checking Emptyness="+al.isEmpty());
		System.out.println("Checking Size Array List="+al.size());
		System.out.println(al.indexOf(200));
		System.out.println(al.contains(10));
		System.out.println(al.get(1));
		System.out.println(al);
	System.out.println("Remove="+al.remove("3rd"));//no true
	      System.out.println(al);
		
		
		//Read Arrylist-
		
		//1.For Loop
		
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");//printout out side array []=NA
		}
		
		
		//Adavance loop-extarct value at runtime
		//in aaraylist some time value are not added not based on index so .size not NA so adavance is use 
		for(Object value:al) {
		System.out.println(value+" ");
		}		
		
		//Extarct value by from collection interfaces we use curser
		
		
		//1-iterator-any interface we know about the size
		System.out.println(al);
		Iterator itr=al.iterator();
		while(itr.hasNext()) {//cheking the next value availebe or not
			System.out.print(itr.next());
		}
		System.out.println();
		ListIterator litr=al.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next());
		}
		
		
		
		System.out.println("*********Reverse ArrayList******");
		System.out.println("Arraylist Before Reverse="+al);
		Collections.reverse(al);
		System.out.println("Array list after Reverse"+al);
		
		
		
		
		Iterator itr2=al.iterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next());
		}
		
		
	}

}
