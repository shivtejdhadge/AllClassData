package StringProgramForInterviewIMP;

public class FindDublicateNumbersInArray {
	public static void main(String[]args){

		int a[]=new int[6];
		a[0]=9;
		a[1]=7;
		a[2]=7;
		a[3]=9;
		a[4]=7;
		a[5]=9;
		int count=0;

		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
		if(a[i]==a[j]){
		System.out.println(a[i]);
		
		}

		}
		}
		System.out.println(count);
}
}