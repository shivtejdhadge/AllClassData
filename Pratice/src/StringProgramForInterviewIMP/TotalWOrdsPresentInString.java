package StringProgramForInterviewIMP;

public class TotalWOrdsPresentInString {
	public static void main(String[]args){

		String s="Shivtej Tukaram Dhadge";
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' ') {
				count++;
			}
		
		}
		System.out.print(count);

}
}