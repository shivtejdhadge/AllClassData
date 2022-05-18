package May16ProgramPratice;

public class PrimeNo {
	public static void main(String[]args){

		int no=13;
		int temp=0;

		for(int i=2;i<6;i++){

		if(no%i==0){

		temp++;
		}

		}

		if(temp>0){
		System.out.println(temp+"No is Not Prime");
		}else{
		System.out.println(temp+"no is Prime");
		}

}

}