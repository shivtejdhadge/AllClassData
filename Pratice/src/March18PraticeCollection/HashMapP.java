package March18PraticeCollection;

import java.util.HashMap;

import java.util.Map.Entry;

public class HashMapP {
	public static void main(String[] args) {
		
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		
		h.put(100,"A");
		h.put(101,"B");
		h.put(102, null);
		System.out.println(h);
		h.put(102,"C");
		h.put(103,"D");
		System.out.println(h);
		h.put(104,"C");
		System.out.println(h);
		System.out.println("Remove="+h.remove(104));
	System.out.println(h);
	System.out.println("Replace Object="+h.replace(102, "Try"));
	System.out.println(h);	
		System.out.println(h.size());
		System.out.println(h.get(103));
		
		//Read
		
		for(Entry<Integer,String>adv:h.entrySet()) {
			System.out.println(adv.getKey()+" "+adv.getValue());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
