package Strings;

public class StringComparisonExamples {

	public static void main(String[] args) {
		
		
		
		String s="Velocity";
		String s1="VELOCITY";
		String s2="Veloc";
		
		////equal----its a Case Sensitive 
		
		System.out.println("The comapre s and s2="+s.equals(s2));
		
		//equalsIgnoreCase
		
		System.out.println("The Compare s and s2 with ignore Case="+s.equalsIgnoreCase(s2));
		
		//Contain--- Check two string Name/Its a case Sensetive 
	
		System.out.println("Check Contain= "+s.contains("Velo"));//s2="veloc" we can Enter
		
		//Emty- check String empty or not
		
		System.out.println("Checking the emtyness of string= "+s2.isEmpty());
		
		//Concats---- addition two string
		
		System.out.println("Concate old ="+s+s1);// Old Methode
		
		System.out.println("concate main="+s.concat(s1));// using Main syntax
		System.out.println("Concates for space =".concat(" ").concat(s1));//for Space
		
		
		// Start With---- FALSE AND TRUE
		
		System.out.println("Start With="+s1.startsWith("Y"));
		
		//Endwith---Case Sensitive
		System.out.println("End with ="+s1.endsWith("Y"));
		
		
		//Replace one word with new
		String s5="This is Python Class";
		System.out.println("Repalce string ="+s5.replace("Python","Java"));
		
		//Substring ----Start with Exact word ANd End before one
		   String s6="The Velocity ";
		System.out.println(s6.substring(4));//Start
		System.out.println(s6.substring(4, 8));//start and end
		
		
		//Split---------(using space or Special Char)
		String s7="abc&xyz&pqr";
		String words[]=s7.split("&");
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
			
		
		
		
		
		
		
		
		
		
		
	}

}
