package AutomationProgramPratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotMethod {
	
	public static WebDriver driver;
	public static void screenshot(WebDriver driver) throws IOException {
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String filename = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		File dest = new File("C:\\Users\\USER\\Desktop\\Website Design Text Files\\Facebook_"+filename);
		
		FileUtils.copyFile(source, dest);
	
	}

	
  public  static void excel() throws EncryptedDocumentException, IOException {
	
	 FileInputStream file=new FileInputStream("C:\\Users\\USER\\Desktop\\Templates\\ElementsofWebpage.xlsx");
	  
	 String get = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	 
	  System.out.println(get);
}
	
	
	
	
	
}
