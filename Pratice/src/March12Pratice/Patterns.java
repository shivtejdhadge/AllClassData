package March12Pratice;

public class Patterns {
	public static void main(String[] args) {
		
//		1
//		2 3
//	    4 5 6
//		7 8 9 10
		
		System.out.println("*******1St*********");
		
	  int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				count=count+1;
				System.out.print(count);
			}
			System.out.println("");
		}
		
		System.out.println("*********2nd**********");
		
//		----1 
//		---2 2 
//		--3 3 3 
//		-4 4 4 4 
//		5 5 5 5 5 
		
		for(int i=1;i<=5;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k+" ");
			}
			System.out.println("");
			
		}
		
		System.out.println("*********3rd**********");
		
		
//		54321
//		5432
//		543
//		54
//		5
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
		}
		System.out.println();
		}
		
//		----1
//		---22
//		--333
//		-4444
//		55555
//		
		
		System.out.println("*********4th**********");
		
        for(int i=1;i<=5;i++) {
        	for(int j=4;j>=i;j--) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=i;k++) {
        		System.out.print(i);
        	}
        	System.out.println();
        }
		
        System.out.println("*********5th**********");
		
//        -11111
//        --2222
//        ---333
//        ----44
//        -----5
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("*********6th**********");
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
