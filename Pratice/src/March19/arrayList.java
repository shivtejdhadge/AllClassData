package March19;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
	public static void main(String[] args) {
		
	
	ArrayList a=new ArrayList();
    a.add("One");
    a.add("Two");
    a.add("Three");
    System.out.println(a);
    System.out.println("Size="+a.size());
    System.out.println("Empty="+a.isEmpty());
    System.out.println("Get="+a.get(0));
     System.out.println(a);
     System.out.println(a.remove(0));
     System.out.println(a);
     a.set(1, "threee");
     System.out.println(a);
     //a.set(0,"one");
     a.add("one");
     System.out.println(a);
     Collections.reverse(a);
      System.out.println(a);
Collections.sort(a);
System.out.println(a);
Collections.sort(a,Collections.reverseOrder());
System.out.println(a);

for(int i=0;i<a.size();i++) {
	//for(int j=0)
}



}
}