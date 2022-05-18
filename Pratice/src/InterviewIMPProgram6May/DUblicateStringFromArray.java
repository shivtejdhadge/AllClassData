package InterviewIMPProgram6May;

public class DUblicateStringFromArray {
	public static void main(String[]args){




		String a[]=new String[4];

		a[0]="Shiv d";
		a[1]="Shivtej";
		a[2]="Shiv";
		a[3]="Shiv d";
		String du=a[0];

		for(int i=1;i<a.length;i++){
//			for(int j=i+1;j<a.length;j++){
			if(a[i]==du){
			System.out.println(a[i]);


		

}
}
	}
}