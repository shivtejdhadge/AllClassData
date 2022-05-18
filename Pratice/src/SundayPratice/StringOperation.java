package SundayPratice;

public class StringOperation {
	public static void main(String[] args) {
		
	
	String s=  "  Shivtej  ";
	
	//Operation
	
	System.out.println("Length="+s.length());
	System.out.println("UpperCase="+s.toUpperCase());
	System.out.println("LowerCase="+s.toLowerCase());
	System.out.println("empty="+s.isEmpty());
	System.out.println("Charat="+s.charAt(3));
	System.out.println("indexof="+s.indexOf("v"));
	System.out.println("last index="+s.lastIndexOf("v"));
	System.out.println("Trim="+s.trim());
	System.out.println("Trim Befoure="+s);
	
	System.out.println("*****************");
	
	//compare
	
	String a="";
	String a1="Shivtej";
	
	System.out.println("equal="+a.equals(a1));
	System.out.println("Equal ignore="+a.equalsIgnoreCase(a1));
	System.out.println("Contains="+a.contains(a1));//check
	System.out.println("concats="+" "+a.concat(" "+a1));
	System.out.println("replace="+a.replace("a","i"));
	System.out.println("Start with="+a.startsWith("Sh"));
	System.out.println("End With="+a1.endsWith("ek"));
	System.out.println("Subsrring="+a1.substring(0,4));
	System.out.println("empty+="+a.isEmpty());

	
	
	System.out.println();
	}

}
