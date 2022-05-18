package IMPProgramInterviewAgain;

public class HighestNo2 {
	public static void main(String[] args) {
		
		int a[]=new int [5];
		a[0]=4;
		a[1]=2;
		a[2]=3;
		a[3]=7;
		a[4]=9;
		
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
		
		System.out.println("2nd Largest no"+a[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
