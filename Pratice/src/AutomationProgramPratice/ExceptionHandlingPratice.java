package AutomationProgramPratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandlingPratice {
	public static void main(String[] args) {
		
		// UnHandle Exception
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		//driver.get("https://www.facebook.com/");		//driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//WebElement eid = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		
		//eid.click();
		
//		WebElement ch = driver.findElement(By.xpath("//a[@class='w3-button w3-bar-item topnav-icons fa fa-adjust']"));
//	
//		ch.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
