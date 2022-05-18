package StringProgramForInterviewIMP;

public class CharCOuntPerticular {
	public static void main(String[]args){

		int count=0;
		String s="Shivtejiii";

		for(int i=0;i<s.length();i++){

		if(s.charAt(i)=='i'){
		count++;
		}
		}
		System.out.println(count);

}
}
