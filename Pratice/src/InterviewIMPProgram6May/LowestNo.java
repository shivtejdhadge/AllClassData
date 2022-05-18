package InterviewIMPProgram6May;

public class LowestNo {
	public static void main(String[] args) {
		

		int a[]=new int[4];
		
		 a[0]=100;
		 a[1]=34;
		 a[2]=67;
		 a[3]=198;
		 
		 int min=a[0];
		 
		for(int i=1;i<a.length;i++) {
			
			
			if(a[i]<min) {
				min=a[i];
			}
			
			
			
		}
		
		System.out.println(min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
