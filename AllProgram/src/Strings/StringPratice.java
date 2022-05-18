package Strings;

public class StringPratice {
	public static void main(String[] args) {
		String a="Laptop";
		String b=" Charger";
		String c="LAPTOP";
		System.out.println("Length is ="+a.length());
		System.out.println("2nd Length is ="+b.length());
		System.out.println("Upper case= "+a.toUpperCase());
		System.out.println("to Lower Case= "+b.toLowerCase());
		System.out.println("char index number= "+a.indexOf("p"));
		System.out.println("Char at position= "+a.charAt(3));
		System.out.println("Last Index= "+a.lastIndexOf("p"));
        System.out.println("Trim="+b.trim());
        
        System.out.println("equal= "+a.equals(c));
        System.out.println("ignore case equals= "+a.equalsIgnoreCase(c));
        System.out.println("Concat= "+a.concat(c));
        System.out.println("contains= "+b.contains("ger"));
        System.out.println("start with="+c.startsWith("L"));
        System.out.println("end with="+c.endsWith("P"));
        System.out.println("substring start ="+a.substring(2));
        System.out.println("substring Start End="+c.substring(3,6));
        System.out.println("Replace new="+c.replace("P", "PS"));
        System.out.println("empty="+c.isEmpty());
		
		
		
		
		

	}

}
