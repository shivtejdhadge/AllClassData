package Collections;

import java.util.TreeSet;

public class TreeSetExamples {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		
//		t.add(10);
//		t.add(200);
//		t.add(201);
//		t.add(202);
//		t.add(10);
		t.add("A");
		t.add("V");
		t.add("G");
		t.add("H");
		//t.add(null);
		System.out.println(t);
		System.out.println(t.isEmpty());
		//System.out.println(t.remove(10));
		System.out.println(t);
		System.out.println("First Value="+t.first());
		System.out.println("Last Value="+t.last());
		
//		int valve=201;
//		System.out.println("Immidiate Higher value of 201="+t.higher(valve));
//		System.out.println("Immidiate Lower value of 201="+t.lower(valve));
	String  val="A";
	 System.out.println("Immidiate Higher value of A="+t.higher(val));
  	System.out.println("Immidiate Lower value of A="+t.lower(val));
		System.out.println("Remove First="+t.pollFirst());
		System.out.println("removeLast="+t.pollLast());
		System.out.println(t);
	
	}

}
