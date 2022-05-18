package AutomationProgramPratice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotPraticeOnAmazon {
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		ScreenShotMethod.screenshot(driver);
		
		WebElement email = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Email')]"));
		
		email.sendKeys("9975609899");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass' and @name='pass']"));
		
		pass.sendKeys("");
		ScreenShotMethod.screenshot(driver);
		Thread.sleep(2000);
		
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		
		login.click();
		Thread.sleep(4000);
		ScreenShotMethod.screenshot(driver);
		
		WebElement account = driver.findElement(By.xpath("//div[@aria-label='Account']"));
		
		account.click();
		Thread.sleep(4000);
		ScreenShotMethod.screenshot(driver);
		
		
		WebElement logout = driver.findElement(By.xpath("//div[@data-nocookies='true']"));
		
		logout.click();
		
		Thread.sleep(2000);
		
		ScreenShotMethod.screenshot(driver);
	}

}
