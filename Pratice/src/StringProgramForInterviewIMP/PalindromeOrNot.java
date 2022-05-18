package StringProgramForInterviewIMP;

public class PalindromeOrNot {
	
	public static void main(String[]args){

		String s="nitinh";
		String rev ="";

		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}

		if(s.equals(rev)){
		System.out.println("String is Palindrome");
		}else{
		System.out.println("String is Not Palindrome");
		}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
