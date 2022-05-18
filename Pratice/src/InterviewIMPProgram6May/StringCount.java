package InterviewIMPProgram6May;

public class StringCount {
	public static void main(String[]args){



		String s="Shivtej Dhadge";
		//char a[]=s.toCharArray();
		int count=0;


		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				
			
			
//			if(a[i]!=' ') {
				count++;
			}
		}
		System.out.println(count);











		}

}
