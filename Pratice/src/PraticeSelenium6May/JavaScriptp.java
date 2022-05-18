package PraticeSelenium6May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptp {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.get("https://www.facebook.com/");
	driver.get("https://pay.facebook.com/");
	JavascriptExecutor js=((JavascriptExecutor)driver);
	WebElement login=driver.findElement(By.xpath("//a[@href='https://www.facebook.com/payments_terms']"));

	js.executeScript("arguments[0].scrollIntoView(true);", login);
	login.click();
	
	
}
}
	
	
	