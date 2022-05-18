package Collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorPrograms {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(15);
		v.add(10);
		v.add("A");
		v.add(15);
		v.add(null);

		System.out.println(v);
		System.out.println("Checking="+v.size());
		System.out.println("Get Value="+v.get(2));
		v.add(2,"B");
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println("Emptyness="+v.isEmpty());
		System.out.println("");
		System.out.println(v);
		System.out.println("Remove="+v.remove("B"));
		System.out.println(v);
		v.set(2, "AB");
		System.out.println(v);
		
		//for loop
		System.out.println("***For Loop***");
		
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}
		
		//Adavance
		System.out.println();
		System.out.println("******Advance******");
		
		for(Object adv:v) {
			System.out.print(adv+ " ");
		}
		
		System.out.println();
		System.out.println("******interator***");
		Iterator vitr=v.iterator();
		while(vitr.hasNext()) {
			System.out.print(vitr.next()+ " ");
		}
		
		System.out.println();
		System.out.println("****ListInerator*****");
		
		ListIterator litr=v.listIterator();
	
			while(litr.hasNext()) {
				System.out.print(litr.next()+" ");
			}
				
			System.out.println();
			System.out.println("***********Enumeration****");
//			Enumeration eitr=v.elements();
//			while(eitr.hasMoreElements()) {
//				System.out.print(eitr.nextElement());
//			}
			
			Enumeration eitr=v.elements();
			while(eitr.hasMoreElements()) {
				System.out.print(eitr.nextElement()+ " ");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
