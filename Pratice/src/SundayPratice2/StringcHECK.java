package SundayPratice2;

public class StringcHECK {
	public static void main(String[] args) {
		String S="Software Testing";
		String S1="";
		//Split
//		
//		String a[]=S.split(" ");
//		for(int i=0;i<S.length();i++){
//			System.out.println(a[i]);
//		}
//		
	//Reverse
		
		for(int i=S.length()-1;i>=0;i--) {
			S1=S1+S.charAt(i);	
		}System.out.println(S1);
		
		System.out.println(S.substring(8,16));
	System.out.println(S.replaceAll("Software","SOFTWARE"));
	
	System.out.println(S);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
