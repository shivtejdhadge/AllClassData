package PraticeSelenium6May;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","C://Users//USER//Desktop//Selenium all Jar file//chromedriver (Version 99)//chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//	driver.get("https://jqueryui.com/resizable/");
//
//		List<WebElement> links = driver.findElements(By.xpath("//ul[@class='footer-site-links']/li/a"));		
//
//		for(int i=0;i<links.size();i++){
//			WebElement link=links.get(i);
//
//		Actions a=new Actions(driver);
//		a.moveToElement(link).perform();
//		
//		Thread.sleep(2000);
//
//		}
				driver.get("https://www.facebook.com/");
//		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//
//		driver.switchTo().frame(frame);		
//		//driver.get("https://jqueryui.com/resizable/");
//
//		WebElement re = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
//		//Actions actions=new Actions(driver);
//		 Actions a=new Actions(driver);
//
//		 a.dragAndDropBy(re, 250, 50).build().perform();
//
//		}

//
//		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
//		Actions a=new Actions(driver);
//		//a.dragAndDrop(drag,drop).build().perform();
//		
//		a.contextClick(drag);
//		a.
//		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		Actions a=new Actions(driver);
	//	a.sendKeys(name, "SHivtej").perform();
		a.keyDown(name, Keys.SHIFT).sendKeys("shivtejjj").keyUp(Keys.SHIFT).perform();
		a.sendKeys(lname, "Dhadge").perform();
		
		a.sendKeys(Keys.ENTER).perform();
		
}
}