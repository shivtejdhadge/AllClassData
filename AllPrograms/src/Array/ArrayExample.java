package Array;

public class ArrayExample {

	public static void main(String[] args) {
//  int []a=new int[4];//Declare The Array
//  a[0]=10;
//  a[1]=20;
//  a[2]=30;
//  a[3]=40;
//  System.out.println("Size of the Array= "+a.length);//Check lenth of Array
//  System.out.println(a[2]);//Read Single Value of Array Or Index
//	for(int i=0;i<a.length;i++) {
//		System.out.print(" "+a[i]);
//	}
//  

	

		// this is for refrence.(how to add multiple values in single line)
//				
//				int ar[]= {100,200,300};
//				//for (int i=0; i<=ar.length;i++) 
//				{
//					System.out.println(ar[2]);
//				}
		
		
//		
//	int []c={10,20,30,40};
//	for(int i=1;i<2;i++) {// Print Single
//	System.out.println(c[i]);
//	}
	
	////////Multidimensional Array.//////////////////
//	
//	int a [] [] = new int [3] [2]; // array declaration
//	// inserting the values.
//	a[0] [0] =100;
//	a[0] [1] = 200;
//	a[1] [0] =300;
//	a[1] [1] = 400;
//	a[2] [0] =500;
//	a[2] [1] = 600;
	
	// find out the size 
	//System.out.println("The Number of Rows "+ a[2][0]);
//	System.out.println("The Number of Rows "+ a.length );
//	System.out.println("The Number of Columns "+ a[0].length);
	// Program to read array.
	
//	for (int i=0; i<a.length;i++) {
//		for (int j=0;j<a[i].length;j++) {
//			System.out.print(a[i][j] +" ");
//		}
//		System.out.println();
//	}
//	


		
		//Multidaimational Array 
		
		int[][]a=new int[3][3];
		a[0][1]=600;
		a[0][0]=800;
		a[0][2]=900;
		a[1][0]=300;
		a[1][1]=200;
		a[1][2]=500;
		a[2][0]=400;
		a[2][1]=500;
		a[2][2]=700;
		
		System.out.println("Lenth Of Row is="+a.length);
		System.out.println("Length of Colom is="+a[0].length);
		System.out.println("Intex Value is="+a[1][1]);
		
		
		
		for (int i=0; i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		
//		
       //   int a[] b[]={{10,20,30}{20,30,40}};
//		
		
		
		
		
			
	

	
	
	
	
	
	}

}
