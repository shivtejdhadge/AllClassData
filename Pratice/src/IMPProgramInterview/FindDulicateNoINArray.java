package IMPProgramInterview;

public class FindDulicateNoINArray {
	
	
	
	public static void main(String[] args) {
		
		int a[]=new int[7];
		a[0]=3;
		a[5]=2;
		a[1]=5;
		a[2]=4;
		a[3]=3;
		a[4]=2;
		a[6]=1;
		
		//3543221
		//0123456
		//System.out.println(a.length);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]);
//		}
		
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
			if((a[i]==a[j])&(i!=j))
			{
			   System.out.println(a[i]);
			}
			}
			
			
			
			
		}
		
		
		
	}
	
	
	

}
