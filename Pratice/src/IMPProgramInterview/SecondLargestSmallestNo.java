package IMPProgramInterview;

public class SecondLargestSmallestNo {
	public static void main(String[] args) {
		
		int a[]=new int [6];
		a[0]=4;
		a[1]=2;
		a[2]=3;
		a[3]=7;
		a[4]=9;
		a[5]=24;
		
		int no;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
			no=a[i];
			a[i]=a[j];
			a[j]=no;
			
			
			}
			}
		}
		
		
		System.out.println(a[1]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
