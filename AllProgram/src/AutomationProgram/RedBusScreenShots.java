package AutomationProgram;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusScreenShots {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.com/");
		ScreenShotMethods.Screenshot(driver);
		Thread.sleep(2000);
		WebElement cookies = driver.findElement(By.xpath("//button[@class='sc-jTzLTM bfMZDh']"));
		
		ScreenShotMethods.Screenshot(driver);
		Thread.sleep(2000);
		cookies.click();
		
		
		WebElement from = driver.findElement(By.xpath("//input[@tabindex='1']"));
		
		from.sendKeys("Pune");
		from.click();
		WebElement To = driver.findElement(By.xpath("//input[@tabindex='2']"));
		
		To.sendKeys("Ahmednagar");
		To.click();
		Thread.sleep(4000);
		
		//WebElement onwarddate = driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']"));
		
//		WebElement onwarddate = driver.findElement(By.xpath("//td[@class='current day']"));
//		
//		onwarddate.click();
		
		
		ScreenShotMethods.Screenshot(driver);
		
		WebElement search = driver.findElement(By.xpath("//button[@class='fl button']"));
		
		
		search.click();
		
		ScreenShotMethods.Screenshot(driver);
		
		
		
		
		
		
		
		
		
		
		
	}

}
