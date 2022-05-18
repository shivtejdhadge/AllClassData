package May16ProgramPratice;

public class ReverseStringByWOrd {
	public static void main(String[]args){

		String s="Shivtej Tukaram Dhadge";

		String a[]=s.split(" ");


		for(int i=a.length-1;i>=0;i--){

		System.out.print(a[i]+" ");

		}


		}

}
