package PraticeSelenium6May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopHandling {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Desktop\\Selenium all Jar file\\chromedriver (Version 99)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	driver.switchTo().frame("iframeResult");
	 WebElement tryS = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
	tryS.click();
	Alert a=driver.switchTo().alert();

	System.out.println(a.getText());
	
	Thread.sleep(3000);
	a.accept();

		
}
}