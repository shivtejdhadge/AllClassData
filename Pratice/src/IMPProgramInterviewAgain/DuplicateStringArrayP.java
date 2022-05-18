package IMPProgramInterviewAgain;

public class DuplicateStringArrayP {
	
//	String a="shiv";
//	String b="tej";
//	String c="Shiv";
	public static void main(String[] args) {
		
	
	String a[]=new String[3];
	a[0]="Dell";
	a[1]="Dell";
	a[2]="Asus";
	
	
	for(int i=0;i<a.length;i++) {
		for(int j=1+i;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
		
		
		
	}
	
	
}
}