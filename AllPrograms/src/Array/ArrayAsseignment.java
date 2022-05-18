package Array;

public class ArrayAsseignment {

	public static void main(String[] args) {
	int[]a=new int[4];
	a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
	int b=a[0]+a[1];
	System.out.println("Search of Values= "+a[3]);//Search Specific Number
	System.out.println("Sum of two array="+b);
	
	String [][]s=new String [3][3];
	s[0] [0]="Name";
	s[0][1]="Subject";
	s[0][2]="Marks";
	s[1][0]="Class";
	s[1][1]="Brach";
	s[1][2]="Year";
	s[2] [0]="Sem";
	s[2][1]="Back";
	s[2][2]="Regular";
	//System.out.println("Search String= "+s[0]+" "+s[1]+" "+s[2]+" ");
	for(int i=0;i<s.length;i++) {
	for(int j=0;j<s[i].length;j++) {
		System.out.print(s[i][j]+" ");
	}
	System.out.println("");
		
	}
	
	System.out.println("search String= "+s[0][0]);
	
	}

}
