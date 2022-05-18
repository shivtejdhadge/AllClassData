package PraticeSelenium6May;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
	public static void main(String[]args) throws EncryptedDocumentException, IOException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
	
		
		FileInputStream file=new FileInputStream("C://Users//USER//Desktop//Templates//HowToFetchExcel.xlsx");

		String prt=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();


		System.out.println(prt);
		
		
		
		
		
		
		
		
}
}