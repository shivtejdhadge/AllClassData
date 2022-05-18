package Strings;

public class StringExample {

	public static void main(String[] args) {
		
		// To Calculate Length
		String s="Velocity";
		String s1="    String Examples  ";
		System.out.println("The Length is+ ="+s.length());
		
		//Covert into Upper Case
		
		System.out.println("To Convert into Upper Case= "+s.toUpperCase());

		//Covert into Lower Case
		
		System.out.println("To Convert into Lower Case= "+s.toLowerCase());
	
		//Charater specify index/Position
		
		System.out.println("The Charater at 3rd Index is= "+s.charAt(3));
		
		// Index/Position of Specific Index 
		
		System.out.println("The Index of i is= "+s.indexOf("i"));
		
		// Last Index of 
		
		System.out.println("The Last Index of i is= "+s.lastIndexOf("i"));
		
		//Trim -----Always Trim first and last Space   not in in middle
		
		System.out.println("The Trim s2 Before Trim="+s1);
		System.out.println("The Trim S2 After Trim="+s1.trim());
	
		
		
		
	}

}
