package InterviewIMPProgram6May;

public class PrimeNo {
	public static void main(String[] args) {
		
		//(7-3,4,5,6,)not divide
		
		int a=7;
		int count=0;
		
		for(int i=2;i<a;i++) {
			
			if(a%i==0) {
				count++;
				
			}
			
		}
		if(count>0)
		{
		System.out.println("No is Not Prime");
		
		}else {
		System.out.println("No is prime");
		}
		
		
		
		
		
		
		
		
	}

}
