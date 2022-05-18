package InterviewIMPProgram6May;

public class SecondHeighestNo {
	
	public static void main(String[] args) {
		
		
		
		int a[]=new int [6];
		a[0]=237;
		a[1]=247;
		a[2]=473;
		a[3]=47;
		a[4]=79;
		a[5]=24;
		
		int num=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					num=a[i];//
					a[i]=a[j];
					a[j]=num;				
				}			
			}
			
		}
		
		
		
		
		System.out.println(a[1]);	
		
		
		
		
		
		
		
		
		
		
	}

}
