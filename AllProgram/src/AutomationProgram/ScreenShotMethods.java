package AutomationProgram;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotMethods {
public static WebDriver driver;

	
	public static void Screenshot(WebDriver driver) throws IOException{
		
		Date d= new Date();
		String file = d.toString().replace(" ", "_").replace(":", "_")+".jpg";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\USER\\Desktop\\Website Design Text Files\\MainPage_"+file);
		FileUtils.copyFile(src,dest);
		
	}
	
//	public static void EnterDataScreenshot() {
//		WebElement login = driver.findElement(By.xpath("//input[starts-with(@name,'email')]"));
//		login.sendKeys("9975609899");
//		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@name,'pass')]"));
//		pass.sendKeys("Shivtej@9899");
		
	//}
//	public static void login(){
//		clicklogin.click();
//		File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest3 = new File("C:\\Users\\USER\\Desktop\\Website Design Text Files\\HomePage.jpg");
//
//		
//	}

	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",  "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//Screenshot();
		
		
		
		
	}

}
