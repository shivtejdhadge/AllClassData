package May16ProgramPratice;

public class CountTotalWOrds {
	public static void main(String[]args){

		String s="Shivtej Tukaram Dhadge";
		int count=0;

		System.out.println(s.length());
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				
				count++;
				
			}
		}
		
		
		
		System.out.println("without space Lengthg"+count);
		

		}


		}


