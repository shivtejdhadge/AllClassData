package May16ProgramPratice;

public class SmallestNoInArray {
	public static void main(String[]args){

		int a[]=new int [4];

		a[0]=12;
		a[1]=23;
		a[2]=20;
		a[3]=12;
		int max=a[0];

		for(int i=1;i<a.length;i++){
			

		if(a[i]<max){
		max=a[i];

		}


		}

System.out.println(max);
}
}
