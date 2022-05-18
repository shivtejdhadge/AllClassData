package InterviewIMPProgram6May;

public class LargestNoFromArray {
	public static void main(String[]args){



		int a[]=new int[4];



		a[0]=45;
		a[1]=120;
		a[2]=230;
		a[3]=34;

		int max=a[0];//45,120,



		for(int i=1;i<a.length;i++) {

			if(a[i]>max){
			max=a[i];
		
		}
		
		}
		System.out.print(max);
		}

}
