package SundayPratice;

public class Arraycheck4 {
	public static void main(String[] args) {
		
	
	int a[]=new int[2];
	a[0]=10;
	a[1]=30;
	int b[]=new int[a.length];
	//a=b;
//	b[0]++;
	b=a;
	//System.out.println(a.c);
	
	System.out.println(a.length);

	System.out.println(b.length);

	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}


	//System.out.println(intList.contain);
	
	
	}
}
