package InterviewIMPProgram6May;

public class Palindrome {
	
	
	public static void main(String[]args){


		int a=12321;
		
		String b=Integer.toString(a);
		
		System.out.println(b);
		
		String c="";
		
		for(int i=b.length()-1;i>=0;i--) {
			c=c+b.charAt(i);			
		}
		
		System.out.println(c);
		if(c==b) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
		
}

}