package IMPProgramInterviewAgain;

public class Lowest2No {
public static void main(String[] args) {
	
	int a[]=new int [5];
	a[0]=48;
	a[1]=24;
	a[2]=33;
	a[3]=78;
	a[4]=93;
	
	int s;
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
			s=a[i];
			a[i]=a[j];
			a[j]=s;
			
			}
		}
	}
	
	
	System.out.println(a[1]);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
