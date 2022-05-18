package IMPProgramInterviewAgain;

public class DublicateIntNumber {
	
	public static void main(String[] args) {
		
		
		int a[]=new int[3];
		
		a[0]=10;
		a[1]=12;
		a[2]=12;
		
		
		
		for(int i=0;i<a.length;i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
