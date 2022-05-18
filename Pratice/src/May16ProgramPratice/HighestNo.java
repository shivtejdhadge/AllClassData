package May16ProgramPratice;

public class HighestNo {
	public static void main(String[] args) {

		
		//2nd 
		
 int a[]=new int[5];
 a[0]=10;
 a[1]=30;
 a[2]=346;
 a[3]=234;
 a[4]=567;
 
 
 int max=0;
 
for(int i=0;i<a.length;i++) {	
for(int j=i+1;j<a.length;j++) {
	
	if(a[i]<a[j]) {
		
		max=a[i];
		a[i]=a[j];
		a[j]=max;
		
		
	}
}
	
	
}
		
		
System.out.println(a[1]);	
		
		
	}

}
