package March19;

public class StringOperations {
	public static void main(String[] args) {
		
		String s="Testing";
		String s1="testing";
		
		System.out.println("UpperCase="+s.toUpperCase());
		System.out.println("LowerCase="+s.toLowerCase());
		System.out.println("char at="+s.charAt(3));
		System.out.println("index of="+s.indexOf("t"));
		System.out.println("Last Index="+s.lastIndexOf("t"));
		System.out.println("Empty="+s.isEmpty());
		System.out.println(s);
		System.out.println("Trim="+s.trim());
		System.out.println("subString="+s.substring(2,4));//st
		System.out.println("*****Compare******");
		System.out.println("equal="+s.equals(s1));
		System.out.println("equal case="+s.equalsIgnoreCase(s1));
		
		System.out.println("Add="+s.concat(s1));
		System.out.println("contains="+s.contains("ing"));
		System.out.println("startwith="+s.startsWith("Te"));
		System.out.println("endswith="+s.endsWith("ing"));
		
//		String s2="Shiv tej";
//		String a[]=s2.split(" ");
//		for(int i=0;i<4;i++) {
//			System.out.println(a[i]);
//		}
//		
		String ac="Software";
		String b="";
		for(int i=ac.length()-1;i<ac.length();i--)
			b=b+ac.charAt(i);
		System.out.println(b);
		
		
		
		
		
		
		
	}

}
