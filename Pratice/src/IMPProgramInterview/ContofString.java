package IMPProgramInterview;

public class ContofString {
	public static void main(String[] args) {
		
	String s="shivtej d";
	//System.out.println(s.length());
	int c=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ')
	c++;
	}
	
	System.out.println(c);
	
	
	}
}
