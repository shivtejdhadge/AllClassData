package IMPProgramInterviewAgain;

public class PrimeNo {
	public static void main(String[] args) {

		int a=1242;
		int temp=0;
		
		for(int i=2;i<a-1;i++) {
			
			if(a%i==0) {
				temp=temp+1;
			}
			
		}
		
		if(temp>0) {
			System.out.println("No is Not Prime");
		}else
			System.out.println("No is Prime");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
