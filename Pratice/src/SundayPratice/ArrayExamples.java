package SundayPratice;

public class ArrayExamples {
	
	public static void main(String[] args) {
//		
//		int a[]= {30,100,70,10};
//		int sum;
//		
//		System.out.println(a.length);
//		//System.out.println("Sring array="+Arrays.toString(a));
//		for(int i:a) {
//			sum =i;
//			System.out.print(sum);
//		
//		}
		
//		int a[][]=new int[3][2];
//		a[0][0]=10;
//		a[0][1]=20;
//		a[1][0]=30;
//		a[1][1]=40;
//		a[2][0]=50;
//		a[2][1]=60;
//		
//		System.out.println(a.length);
//		System.out.println(a[0].length);
//		System.out.println();
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<a[i].length;j++) {
//				System.out.print(a[i][j]+" ");
//							}
//			System.out.println();
//		}
//		
//		
		
		int a[][]=new int [3][3];
		
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		a[1][0]=101;
		a[1][1]=201;
		a[1][2]=301;
		a[2][0]=102;
		a[2][1]=202;
		a[2][2]=302;
		
		System.out.println(a.length);
		System.out.println(a[0].length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		
	}

}
