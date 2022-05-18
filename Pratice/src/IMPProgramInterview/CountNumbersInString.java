package IMPProgramInterview;

public class CountNumbersInString {
	public static void main(String[] args) {
	
		String s=" Life is a beatiful so enjoy it";
		
		char[] ar = s.toCharArray();
		
		int count = 0;
		for(char c:ar) {
			switch(c){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					
				count++;	
			}
		}
System.out.println("Total="+count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
