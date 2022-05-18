package HashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapPratice {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(106,"Avi");
		hm.put(100,"Rajesh");
		hm.put(101, "Vaibhav");
		hm.put(102,"Harshal");
		hm.put(104,"Shiv");
		hm.put(105, "Manish");
		System.out.println(hm);
		
		System.out.println("EmptyNEss="+hm.isEmpty());
		System.out.println("Kay Contains="+hm.containsKey(102));
		System.out.println("Valve Contain="+hm.containsValue("Shiv"));
		System.out.println(hm);
		System.out.println("Remove Key ="+hm.remove(102));//Key Remove
		System.out.println(hm);
		System.out.println("Remove Key & Valve="+hm.remove(105, "Manish"));
		System.out.println(hm);
		System.out.println("Size="+hm.size());
		System.out.println("Get Valuve from Key="+hm.get(101));
		System.out.println(hm);
		
		//Read 
		for(Entry<Integer, String> adv:hm.entrySet()) {
			System.out.println(adv.getKey()+"-->"+adv.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
