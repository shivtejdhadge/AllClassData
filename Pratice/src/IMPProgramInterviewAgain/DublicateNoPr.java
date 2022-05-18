package IMPProgramInterviewAgain;

public class DublicateNoPr {
	public static void main(String[] args) {
		
		
		int array[]=new int[5];
		array[0]=6;
		array[1]=4;
		array[2]=5;
		array[3]=6;
		array[4]=9;
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					System.out.println(array[i]);
					
				}
			}
		}
		
		
		
		
		
	}

}
