package IMPProgramInterviewAgain;

public class PalidromUsingBuilderClass {
	
	public static void main(String[] args) {
		
	
//	String s="nitin";
//	String r="";
//	
//	for(int i=s.length()-1;i>=0;i--) {
//		
//		r=r+s.charAt(i);
//	
//	}
//	
//	System.out.println("after Reverse==>"+r);
//	
//	if(s.equals(r)) {
//	System.out.println("Is Palindrome");
//	}else {
//		System.out.println("Is Not Palindrome");
//	}
//	
	
	// By SUing Builder
	
	
	
	
	StringBuilder sb=new StringBuilder("nitin");
	StringBuilder rvsb = sb.reverse();
	          String rvstr = rvsb.toString();
	
	if(sb.equals(rvstr)) {
		System.out.println("Is Palindrome");
	}else {
		System.out.println("Is Not Palindrome");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
