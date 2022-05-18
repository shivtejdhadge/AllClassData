package PraticeSelenium6May;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utility {
	
	
	public static void getscreenshot(WebDriver driver) throws IOException {
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C://Users//USER//Desktop//Templates//Facebookkkk.jpg");
		
		FileUtils.copyFile(source, dest);
		
	}

	
	public static void drowBorder(WebDriver driver,WebElement email) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", email);
		
	}


	public static void alert(WebDriver driver,String Message) {
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+Message+"')");
		
	}
	
	
		
		
	
	
	
	
}
