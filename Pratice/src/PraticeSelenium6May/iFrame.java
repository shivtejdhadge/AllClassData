package PraticeSelenium6May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_target");
		
		
		driver.switchTo().frame("iframeResult");


		 WebElement link = driver.findElement(By.xpath("//a[text()='W3Schools.com']"));
		 
		 Thread.sleep(2000);
		link.click();
		
		
		driver.switchTo().parentFrame();
		WebElement theme=driver.findElement(By.xpath("//a[@onclick='retheme()']"));
		Thread.sleep(2000);
		theme.click();
		
		
		
		
		
		
	}

}
