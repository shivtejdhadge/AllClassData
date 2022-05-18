package StringProgramForInterviewIMP;

public class ReverseStringByWords {
	
	public static void main(String[]args){

		String s="Shivtej Tukaram Dhadge";

		String ar[]=s.split(" ");
		
//		for(int i=0;i<=ar.length;i++) {
//			System.out.println("list"+ar[i]);
//		}

		for(int i=ar.length-1;i>=0;i--){

			System.out.print(ar[i]+" ");

		}
		

}
}