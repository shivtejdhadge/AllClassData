package AutomationProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelAdvance {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file;// file name come 2nd time so we declare class level
		
		// 1. Reading Multiple Value from Single Column
		
//		for(int i=11;i<=15;i++) {
//			
//			FileInputStream file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\Test Case Temples 3-April-2022.xlsx");
//			
//		 String print = WorkbookFactory.create(file).getSheet("Login").getRow(i).getCell(0).getStringCellValue();
//			
//			System.out.println(print);		
//		}
		
	
		
		// 2. Reading Multiple Value from Single Column
		
//		for(int i=11;i<=15;i++) {
//			for(int j=0;j<=1;j++) {
//				FileInputStream file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\Test Case Temples 3-April-2022.xlsx");
//			    String tc = WorkbookFactory.create(file).getSheet("login").getRow(i).getCell(j).getStringCellValue();
//			System.out.print(tc+"-->");
//			}
//			System.out.println();
//		}
//		
		
		
		
		//3.Reading The Row Value Dynamically
		
//		
//		 file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\HowToFetchExcel.xlsx");
//		int rownum = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
//		//System.out.println(rownum);
//
//		for(int i=0;i<=rownum;i++) {
//			
//		file=new FileInputStream ("C:\\Users\\USER\\Desktop\\Templates\\HowToFetchExcel.xlsx");
//		String rows = WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(0).getStringCellValue();
//		System.out.println(rows);	
//		}
//	
		
		
		// 4.Fetct Rows and Column dynamically
		
		file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\HowToFetchExcel.xlsx");
		int rownum = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		
		file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\HowToFetchExcel.xlsx");
		int cellnum = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		
		for(int i=0;i<=rownum;i++) {
			for(int j=0;j<cellnum;j++) {
				
				file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\HowToFetchExcel.xlsx");
				String finalp = WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(finalp+"==>");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
