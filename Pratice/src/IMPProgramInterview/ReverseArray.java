package IMPProgramInterview;

public class ReverseArray {
	public static void main(String[] args) {
		
		int  a[]=new int [4];
		
		a[0]=3;
		a[1]=5;
		a[2]=7;
		a[3]=19;
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
		}
		
		System.out.println("After");
		for(int j=a.length-1;j>=0;j--) {
			System.out.print(a[j]);
		}
		
		
		
		
		
	}

}
