package InterviewIMPProgram6May;

public class SecondSmallestNo {

	public static void main(String[]args){
		int a[]=new int[4];
		 	a[0]=550;
			a[1]=980;
			a[2]=320;
			a[3]=410;

			int count=a[0];

			
					
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			if(a[i]<a[j]){
				count=a[i];
				a[i]=a[j];
				a[j]=count;
				
				
		}


	
		}
			

}
		
		System.out.println(a[1]);
	}
}