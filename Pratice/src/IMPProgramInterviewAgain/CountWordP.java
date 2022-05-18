package IMPProgramInterviewAgain;

public class CountWordP {
	
	public static void main(String[]args){

		String s="we belong to m group";

		char[] arr=s.toCharArray();
		int count=0;
		

		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] =='a') {
				count++;
			}
			
			
			
		}

		System.out.println("Count=="+count);
	}

}
