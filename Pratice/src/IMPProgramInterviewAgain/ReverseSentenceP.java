package IMPProgramInterviewAgain;

public class ReverseSentenceP {
public static void main(String[] args) {
	
	
	String s="Shivtej Tukaram Dhadge";
	String r="";
	
	
	String arr[]=s.split(" ");
	
	for(int i=arr.length-1;i>=0;i--) {
		
		r=r+arr[i]+" ";
		System.out.println(r);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
