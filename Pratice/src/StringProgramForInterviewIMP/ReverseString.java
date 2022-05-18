package StringProgramForInterviewIMP;

public class ReverseString {
	public static void main(String[]args){

		String s="Hi Shivtej Dhadge";

		String re="";

		for(int i=s.length()-1;i>=0;i--){
			re=re+s.charAt(i);
		}

		System.out.println(re);

		}


//StringBuilder sb=new StringBuilder("Shivtej");
//
//
//
//	System.out.println(sb.reverse());
//		
		
		
}
