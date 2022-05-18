package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExamples {
	public static void main(String[] args) {
		
		//HashMap-Asending Order
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(109,"ABC");
		hm.put(101,"PQR");
		hm.put(102,"LMN");
		hm.put(102,"XYZ");//Dublicate will replace
		hm.put(null, "CD");
		hm.put(null,"AB");//only one Null Accept at Key
	
		System.out.println(hm);
		hm.remove(null);
		System.out.println(hm);
		hm.remove(101, "PQR");//Case Sensetive
		System.out.println(hm);
		System.out.println("Size="+hm.size());
		System.out.println("Get Value Of Key(102)="+hm.get(102));
		
		System.out.println("Check Emptyness="+hm.isEmpty());
		System.out.println("Check Key Contain="+hm.containsKey(109));
		System.out.println("Check Value Contain="+hm.containsValue("XYZ"));
	
		//Read
		System.out.println("*******Advance Read******");
	     //for(Entry(Integer,String)adv:hm.EntrySet())
		//for(Entry<Integer, String> adv:hm.entrySet())
			for(Entry<Integer,String>adv:hm.entrySet()) {
				System.out.println(adv.getKey()+" "+adv.getValue());
			}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
