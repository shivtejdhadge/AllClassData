package March27SundayPratice;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer,String>();
		
		
		h.put(101,"Shiv");
		h.put(102, "vaib");
		h.put(103, "rajesh");
          System.out.println(h);
          h.remove(101);
          System.out.println(h);
         h.put(102, "Vaibhav");
         System.out.println(h);
         
        for(Entry<Integer,String>adv:h.entrySet()) {
        	System.out.println(adv.getKey()+adv.getValue());
        }

		
		
		
	}

}
