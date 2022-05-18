package AutomationProgramPratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataFetchPratice  {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\ElementsofWebpage.xlsx");
	
		String str = WorkbookFactory.create(file).getSheet("Sheet1").getRow(12).getCell(4).getStringCellValue();		
		
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
	}

}
