package PraticeSelenium6May;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExceptionP {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/resizable/");
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
				driver.switchTo().frame(frame);
		WebElement re = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		WebElement risky=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		
		Actions a=new Actions(driver);
		
		try{
			a.dragAndDropBy(risky, 50, 50).perform();
			System.out.println("TRY");
			
		}catch(Exception e) {
			a.dragAndDropBy(re, 250, 50).perform();
		System.out.println("cATCH");
		}
	}

}
