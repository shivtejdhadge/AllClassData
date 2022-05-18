package IMPProgramInterview;

public class DublicateStringArray {
	public static void main(String[] args) {
		
		
	
	String a[]=new String [3];
	
	a[0]="Shiv";
	a[1]="tej";
	a[2]="tej";
	
//	for(int i=0;i<a.length;i++) {
//		System.out.println(a[i]);
//	}
	
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
