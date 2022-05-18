package AutomationProgram;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExceptionHandelling {
	
	public static void main(String[] args) {
		int a=100;
		int b=2;
		System.out.println("Start Prog");
		
		
		// Checked Exception
		
		
		
//		try{
//			Thread.sleep(2000);
//			
//		}catch(Exception e){
//			e.printStackTrace();
//			
//		}
//		
//		System.out.println("Prog End");
//		
//		
//		try {
//			FileInputStream file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\ElementsofWebpage.xlsx");
//		 String pass = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println("Try="+pass);
//		}catch(Exception e) {
//			e.fillInStackTrace();
//		System.out.println("Print=Catch-");	
//		}
//		
		
		
		//UncheckException
		
		//1.Arthematic Exception
//		
//		try {
//			System.out.println("try Arhematic=>"+(a/0));
//		}catch(Exception e) {
//			e.fillInStackTrace();
//			System.out.println("Catch==>"+a/b);
//		}finally {
//			System.out.println("Finnalyyy");// For Excute
//		}
//		
		
		//Null P{ointer Exception
//		String va=null;
//		try {
//			System.out.println(va.length());
//		}
//		}catch(Exception e){
//			e.fillInStackTrace();
//			System.out.println("Catch");
//		}
//		
//		finally {
//			
//		}
	
	
	//3.NumberFormat Exception
		
//	String s="1234  P";
//	
//	
//	int n=Integer.valueOf(s);
//	
//	System.out.println(n);
//	
	//wtry to convert string to int but if string contain WOrds then  cant conver words
	
		
		
		
		// Example 4:-  ArrayoutofBound Exception
		
//						int ar[] = new int[5];
//						ar[0]=10;
//						//ar[10]= 500;
//						System.out.println(ar[7]);
//	
	
	
	
	
	
	
	}

}
