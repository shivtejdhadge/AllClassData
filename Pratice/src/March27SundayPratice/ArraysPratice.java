package March27SundayPratice;

public class ArraysPratice {
	
	public static void main(String[] args) {
		
		
//		String a[]=new String[3];
//		
//		a[0]="A";
//		a[1]="B";
//		a[2]="C";
//		//a[3]="D";
//		System.out.println(a.length);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println(a[2]);
//		
		int v[][]=new int[2][2];
		
		v[0][0]=10;
		v[0][1]=20;
		v[1][0]=30;
		v[1][1]=40;
		for(int i=0;i<v.length;i++) {
			for(int j=0;j<v[i].length;j++)
			System.out.print(v[i][j]);
		}
		
		
	}

}
