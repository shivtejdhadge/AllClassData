package InterviewIMPProgram6May;

public class DupblicateNumberFromArray {
	public static void main(String[]args){




		int a[]=new int[4];

		a[0]=10;
		a[1]=20;
		a[2]=20;
		a[3]=20;
		int count = a[0];
		for(int i=0;i<a.length;i++){
//			for(int j=i+1;j<a.length;j++){
			if(a[i]==count){
			System.out.println(a[i]);
			count++;


		

}
		}
		System.out.println(count);
	}
}