package AutomationProgram;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotsProgram {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",  "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\USER\\Desktop\\Website Design Text Files\\MainPage.jpg");
		FileUtils.copyFile(src,dest);
		
		
		Thread.sleep(4000);
		
		WebElement login = driver.findElement(By.xpath("//input[starts-with(@name,'email')]"));
		login.sendKeys("9975609899");
		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@name,'pass')]"));
		pass.sendKeys("Shivtej@9899");
		File src1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//take sc
		File dest1 = new File("C:\\Users\\USER\\Desktop\\Website Design Text Files\\Login and pass Enter.jpg");
		FileUtils.copyFile(src1,dest1);
		
		WebElement clicklogin = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		
		clicklogin.click();
		
		Thread.sleep(5000);
		File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest3 = new File("C:\\Users\\USER\\Desktop\\Website Design Text Files\\HomePage.jpg");

		FileUtils.copyFile(src3, dest3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
