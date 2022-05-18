package AutomationProgramPratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelSheetFetchPratice {
	

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file;
		
		//1.when kown the excelsheet row and colum no
		
		
		file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\ElementsofWebpage.xlsx");
		
		int rownum = WorkbookFactory.create(file).getSheet("sheet1").getLastRowNum();
		
		file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\ElementsofWebpage.xlsx");
		int cellnum = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getLastCellNum();
		
		for(int i=0;i<=0;i++) {
			for(int j=0;j<cellnum;j++) {
		file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\ElementsofWebpage.xlsx");
		String ro = WorkbookFactory.create(file).getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				
		System.out.print(ro+" ");
			}
			
		}
		System.out.println();
		
		for(int r=1;r<=rownum;r++) {
			for(int n=0;n<cellnum;n++) {
				file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\ElementsofWebpage.xlsx");
				String all = WorkbookFactory.create(file).getSheet("sheet1").getRow(r).getCell(n).getStringCellValue();
			System.out.print(all+" ");	
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
