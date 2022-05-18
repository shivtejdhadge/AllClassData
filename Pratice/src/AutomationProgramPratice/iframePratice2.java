package AutomationProgramPratice;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class iframePratice2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
		
		//driver.switchTo().frame("iframeResult");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='iframeResult']"));
		driver.switchTo().frame(frame);
		
		WebDriverWait waits=new WebDriverWait(driver,30);
		waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button']"))).click();
//		WebElement click = driver.findElement(By.xpath("//button[@type='button']"));
//		
//		click.click();
		
//		driver.switchTo().parentFrame();
		

		
	}
	
	
	
	

}
