package AutomationProgramPratice;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SSMain {
	public static WebDriver driver;
	public static void Screenshot(WebDriver driver) throws IOException {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d=new Date();
		String time = d.toString().replace(" ","_").replace(":","_")+".jpg";
		File dest = new File("C:\\Users\\USER\\Desktop\\Website Design Text Files\\Try_"+time);
		
		FileUtils.copyFile(file, dest);
		
	}

}
