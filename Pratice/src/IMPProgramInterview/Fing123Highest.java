
package IMPProgramInterview;

public class Fing123Highest {
	public static void main(String[] args) {
		
		int[] a=new int[4];
		a[0]=565;
		a[1]=88790;
		a[2]=352;
		a[3]=5671;
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]>max){
				max=a[i];
			}
			
			
		}
		
		System.out.println(max);
		
		
		
		
	}

}
