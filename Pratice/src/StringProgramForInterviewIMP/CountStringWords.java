package StringProgramForInterviewIMP;

public class CountStringWords {
	public static void main(String[]args){

		String s="Shivtej Tukaram Dhadge";
		char[] ar=s.toCharArray();
		
		int count=0;

		for(char a:ar){
		switch(a){
			case 'a':
			case 'd':
			case 's':
			count++;

		}
		}
		System.out.println(count);
}
}