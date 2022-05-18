package March12Pratice;

public class StringOperations {
	
	public static void main(String[] args) {
		
		String a="Shivtej Dhadge";
		String b="Dhadge";
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		System.out.println(a.charAt(4));
		System.out.println(b.indexOf("a"));
		System.out.println(a.lastIndexOf("j"));
		System.out.println(b.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.concat(b));
		System.out.println(a.startsWith("s"));
		System.out.println(b.endsWith("e"));
		System.out.println(a.replace("Shiv","shav"));
		System.out.println(a.substring(4,6));
        
		String c[]=a.split(" ");
		for(int i=a.length();i>=0;i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
