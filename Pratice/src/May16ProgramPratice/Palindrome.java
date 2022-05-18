package May16ProgramPratice;

public class Palindrome {
	public static void main(String[]args){


		String s="nitin";
		String r="";

		for(int i=s.length()-1;i>=0;i--){
			r=r+s.charAt(i);


			
		}
		System.out.println(r);

		if(r.equals(s)){
			System.out.println("is Palindrome");
		}else{
		System.out.println("is Not Palindrome");
		}

}
}